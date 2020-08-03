package cl.m5d12.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import cl.m5d12.dao.Pago;
import cl.m5d12.servicio.PagoServicio;

@Controller
public class PagoControlador {

	@Autowired
	PagoServicio ps;
	
	Logger log = Logger.getLogger(PagoControlador.class.getName());
	
	@RequestMapping("/listarpagos")
	public String verpagos(Model m) {
		List<Pago> listapago = ps.listaPago();
		m.addAttribute("lpago",listapago);
		log.info("Viendo lista de pagos");
		return "listadopagos";
	}
	
    @RequestMapping("/pagoform")    
    public String showform(Model m, Model modelo, HttpServletRequest request){
        Principal principal = request.getUserPrincipal();
        String name = principal.getName();
        int username = Integer.parseInt(name);
        modelo.addAttribute("id", username);
    	m.addAttribute("command", new Pago());
    	log.info("Crea formulario de pagos");
        return "pagoform";
    } 
    
    @RequestMapping(value="/grabapago",method = RequestMethod.POST)    
    public String save(@ModelAttribute("pag") Pago pag){    
        ps.addPago(pag); 
        log.info("Registra un pago nuevo");
        return "redirect:/listapagos";
    }
        
    @RequestMapping(value="/eliminarusuario/{idPago}")
	public String eliminaPago(@PathVariable int idPago) {
		ps.deletePago(idPago);
		log.info("Elimina un pago");
		return "redirect:/listapagos";
	}
	
	@RequestMapping(value="/editusuario/{idPago}")
		public String editaPago(@PathVariable int idPago, Model modelo) {
		Pago pag = ps.findPagoByid(idPago);
		log.info("Ingresao a editar usuario");
		modelo.addAttribute("command", pag);
		log.info("Editando pago");
		return "editarpago";
	}
	
	@RequestMapping(value="/guardapago", method = RequestMethod.POST) 
    public String guardaPago(Pago pag){
        ps.updatePago(pag);
        log.info("Pago editado correctamente");
		return "redirect:/listapagos";
    }

	
	
}
