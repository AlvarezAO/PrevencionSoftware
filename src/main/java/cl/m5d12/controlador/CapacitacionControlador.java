package cl.m5d12.controlador;

import java.security.Principal;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import cl.m5d12.dao.Capacitacion;
import cl.m5d12.servicio.CapacitacionServicio;
import cl.m5d12.servicio.ClienteServicio;

@Controller
public class CapacitacionControlador {

	@Autowired
	CapacitacionServicio capaser;
	
	@Autowired
	ClienteServicio clis;
	
	Logger log = Logger.getLogger(CapacitacionControlador.class.getName());
	
	
	
	@RequestMapping("/listarcapa")
	public String verCapa(Model m) {
		List<Capacitacion> listacapa = capaser.listacapacitacion();
		m.addAttribute("listcapa", listacapa);
		log.info("Ha visto la lista de capacitaciones ");
		return "listadocapacitacion";
	}
	
	@RequestMapping("/capaform")
	public String showCapaForm(Model m, Model mo, HttpServletRequest request) {		
		Principal principal = request.getUserPrincipal(); 
		String name = principal.getName();
		int username = Integer.parseInt(name);
		mo.addAttribute("id", username);
		m.addAttribute("command", new Capacitacion());
		log.info("Creando capacitacion ");
		return "capaform";		
	}
	
	@RequestMapping(value="/eliminacapa/{idCapa}")
	public String eliminaCapa(@PathVariable int idCapa) {
		capaser.deleteCapa(idCapa);
		log.info("Se ha borrado " + capaser);
		return "redirect:/listarcapa";
	}
	
	@RequestMapping(value="/editacapa/{idCapa}")
	public String editaCapa(@PathVariable int idCapa, Model m) {
		Capacitacion cap = capaser.findCapacitacionByid(idCapa);
		m.addAttribute("command", cap);
		log.info("Editando a  " + cap);
		return "edicapacitacion";
	}
	
	@RequestMapping(value="/changecapa", method=RequestMethod.POST)
	public String cambiaCapa(Capacitacion cap) {
		capaser.updateCapa(cap);
		log.info("Edicion correcta de "+ capaser);
		return "redirect:/listarcapa";
	}
	
	@RequestMapping(value="/savecapa", method=RequestMethod.POST)
	public String guardaCapa(@ModelAttribute("capa") Capacitacion capa) {
		capaser.addCapa(capa);
		log.info("Capacitacion creada " + capaser);
		return "redirect:/listarcapa";
	}
}
