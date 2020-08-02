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

import cl.m5d12.dao.Asesoria;
import cl.m5d12.dao.Cliente;
import cl.m5d12.servicio.AsesoriaServicio;
import cl.m5d12.servicio.ClienteServicio;

@Controller
public class AsesoriaControlador {

	@Autowired
	AsesoriaServicio as;
	
	@Autowired
	ClienteServicio Clis;
	
	Logger log = Logger.getLogger(AsesoriaControlador.class.getName());
	
	@RequestMapping("/listarasesorias")
	public String verasesorias(Model m) {
		List<Asesoria> listaasesorias = as.listaAseso();
		m.addAttribute("lasesorias", listaasesorias);
		return "listadoasesorias";
	}
	
	@RequestMapping("/asesoform")
	public String mostarForm(Model m) {
		  
		m.addAttribute("command", new Asesoria());
		return "asesoform";
	}
	
	@RequestMapping(value="/guardaAseso", method=RequestMethod.POST)
	public String guardaAse(@ModelAttribute("Ase") Asesoria ase) {
		System.out.println(ase.getCliente());;
		as.addAsesoria(ase);
		return "redirect:/listarsesorias";
	}
	
	@RequestMapping(value="/editAsesoria/{idAseso}")
	public String editaAseso(@PathVariable("idAseso") long idAseso, Model modelo, HttpServletRequest request) {
	Principal principal = request.getUserPrincipal();
	String name = principal.getName();
	int username = Integer.parseInt(name);		
		
	Asesoria ases = new Asesoria();
	Cliente c = Clis.findClienteByid(username);
	ases.setCliente(c);
	modelo.addAttribute("cliente", c);
	modelo.addAttribute("asesoria", ases);
	return "editaseso";	
	}
	
	@RequestMapping(value="/eliminaaseso/{idAseso}")
	public String eliminaaseso(@PathVariable int idAseso) {
		as.deleteAsesoria(idAseso);
		return "redirect:listarasesorias";
	}
	
	@RequestMapping(value="/changeaseso", method= RequestMethod.POST)
	public String cambiadatosaseso(Asesoria ase) {
		as.updateAsesoria(ase);
		return "redirect:/listarclientes";
	}
	
	
}
