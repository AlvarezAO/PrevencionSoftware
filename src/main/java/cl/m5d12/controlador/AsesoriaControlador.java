package cl.m5d12.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.logging.Logger;

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
		return "listadoasesorias";
	}
	
	@RequestMapping("/asesoform")
	public String mostarForm(Model m) {
		m.addAttribute("command", new Asesoria());
		return "asesoform";
	}
	
	@RequestMapping(value="/guardaAseso", method=RequestMethod.POST)
	public String guardaAse(@ModelAttribute("Ase") Asesoria ase) {
		as.addAsesoria(ase);
		return "redirect:/listarsesorias";
	}
	
	@RequestMapping(value="/editAesoria/{idAseso}")
	public String editaAseso(@PathVariable int idAseso, Model modelo) {
	Asesoria ase = as.findClienteByid(idAseso);
	modelo.addAttribute("command", ase);
		return "editaseso";	
	}
	
	@RequestMapping(value="/eliminaaseso/{idAseso}")
	public String eliminaaseso(@PathVariable int idAseso) {
		as.deleteAsesoria(idAseso);
		return "redirect:/listarasesorias";
	}
	
	@RequestMapping(value="/changeaseso", method= RequestMethod.POST)
	public String cambiadatosaseso(Asesoria ase) {
		as.updateAsesoria(ase);
		return "redirect:/listarclientes";
	}
	
	
}
