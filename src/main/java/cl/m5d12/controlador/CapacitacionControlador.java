package cl.m5d12.controlador;

import java.security.Principal;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cl.m5d12.dao.Capacitacion;
import cl.m5d12.dao.Cliente;
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
		return "listadocapacitacion";
	}
	
	@RequestMapping("/capaform")
	public String showCapaForm(Model m, Model mo, HttpServletRequest request) {		
		Principal principal = request.getUserPrincipal(); 
		String name = principal.getName();
		int username = Integer.parseInt(name);
		
		mo.addAttribute("id", username);
		m.addAttribute("command", new Capacitacion());
		
		return "capaform";		
	}
	
	@RequestMapping("/savecapa")
	public String guardaCapa( Capacitacion capa, HttpServletRequest request) {
		
		capaser.addCapa(capa);
		return "redirect:/listarcapa";
	}
	
	@RequestMapping(value="/eliminacapa/{idCapa}")
	public String eliminaCapa(@PathVariable int idCapa) {
		capaser.deleteCapa(idCapa);
		return "redirect:/listarcapa";
	}
	
	@RequestMapping(value="/editacapa/{idCapa}")
	public String editaCapa(@PathVariable int idCapa, Model m) {
		Capacitacion cap = capaser.findCapacitacionByid(idCapa);
		m.addAttribute("command", cap);
		return "edicapacitacion";
	}
	
	@RequestMapping(value="changecapa", method=RequestMethod.POST)
	public String cambiaCapa(Capacitacion cap) {
		capaser.updateCapa(cap);
		return "redirect:/listarcapa";
	}
	
}
