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
import cl.m5d12.servicio.AsesoriaServicio;

@Controller
public class AsesoriaControlador {

	@Autowired
	AsesoriaServicio as;
	
	Logger log = Logger.getLogger(AsesoriaControlador.class.getName());
	

	@RequestMapping("/listarasesorias")
	public String verasesorias(Model m) {
		List<Asesoria> listaasesorias = as.listaAseso();
		m.addAttribute("lasesorias", listaasesorias);
		log.info("Se ha visto lista asesoria");
		return "listadoasesorias";
	}
	
	@RequestMapping("/asesoform")
	public String mostarForm(Model m, Model mo, HttpServletRequest request) {
		Principal principal = request.getUserPrincipal();
		String name = principal.getName();
		int username = Integer.parseInt(name);
		mo.addAttribute("id", username);
		m.addAttribute("command", new Asesoria());
		log.info("Crea formulario asesoria");
		return "asesoform";
	}
	
	@RequestMapping(value="/eliminaaseso/{idAseso}")
	public String eliminaaseso(@PathVariable int idAseso) {
		as.deleteAsesoria(idAseso);
		log.info("Elimina formulario asesoria");
		return "redirect:/listarasesorias";
	}
	
	@RequestMapping(value="/editAsesoria/{idAseso}")
	public String editaAseso(@PathVariable int idAseso, Model modelo) {
	Asesoria ases = as.findAsesoriaByid(idAseso);
	modelo.addAttribute("command", ases);
	log.info("Crea edicion formulario asesoria");
	return "editaseso";	
	}
	
	@RequestMapping(value="/changeaseso", method= RequestMethod.POST)
	public String cambiadatosaseso(Asesoria ase) {
		as.updateAsesoria(ase);
		log.info("Realiza cambio en asesoria " + ase);
		return "redirect:/listarasesorias";
	}
	
	
	@RequestMapping(value="/guardaAseso", method=RequestMethod.POST)
	public String guardaAse(@ModelAttribute("Ase") Asesoria ase) {
		try {
			as.addAsesoria(ase);
			log.info("Guarda nuevo formulario asesoria");
		} catch (Exception e) {
			log.info("Error al guardar nuevo formulario asesoria");
		}
		return "redirect:/listarasesorias";
	}
	
	
	
	
}
