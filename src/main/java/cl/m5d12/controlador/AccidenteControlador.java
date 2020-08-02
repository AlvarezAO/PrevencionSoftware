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

import cl.m5d12.dao.Accidente;
import cl.m5d12.servicio.AccidenteServicio;

@Controller
public class AccidenteControlador {
	
	@Autowired
	AccidenteServicio acc;
	
	Logger log = Logger.getLogger(AsesoriaControlador.class.getName());
	
	@RequestMapping("/listaraccidentes")
	public String veraccidentes(Model m) {
		List<Accidente> listaaccidentes = acc.listaAccidente();
		m.addAttribute("laccidente", listaaccidentes);
		log.info("Lista de accidentes revisada");
		return "listadoaccidente";
	}
	
	@RequestMapping("acciform")
	public String mostrarAccForm(Model m, Model mo, HttpServletRequest request) {
		Principal principal = request.getUserPrincipal();
		String name = principal.getName();
		int username = Integer.parseInt(name);
		
		mo.addAttribute("id", username);
		m.addAttribute("command", new Accidente());
		log.info("Formulario accidente creado por rut: " + name);
		
		return "acciform";		
	}
	
	@RequestMapping(value="/eliminaacci/{idAccidente}")
	public String eliminaacci(@PathVariable int idAccidente) {
		acc.deleteAccidente(idAccidente);
		log.info("Reporte accidente eliminado");
		return "redirect:/listaraccidentes";
	}
	
	@RequestMapping(value="/editAccidente/{idAccidente}")
	public String editaAcci(@PathVariable int idAccidente, Model m) {
		Accidente acci = acc.findAccidenteByid(idAccidente);
		m.addAttribute("command", acci);
		log.info("Formulario accidente editado: " + acci);
		return "ediaccidente";
	}
	
	@RequestMapping(value="/changeAcci", method = RequestMethod.POST)
	public String cambiaAccidente(Accidente accidente) {
		acc.updateAccidente(accidente);
		log.info("Formulario accidente editado: " + acc);
		return "redirect:/listaraccidentes";		
	}
	
	@RequestMapping(value="/guardaaccidente", method = RequestMethod.POST)
	public String saveAcci(@ModelAttribute("acci") Accidente acci) {
		acc.addAccidente(acci);
		log.info("Formulario accidente creado: " + acci);
		return "redirect:/listaraccidentes";
	}
}
