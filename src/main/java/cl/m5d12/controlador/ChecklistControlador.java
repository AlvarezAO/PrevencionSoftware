package cl.m5d12.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.m5d12.dao.Checklist;
import cl.m5d12.servicio.ChecklistServicio;

import java.security.Principal;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
@Controller
public class ChecklistControlador {

	@Autowired
	ChecklistServicio chk;
	
	Logger log = Logger.getLogger(Checklist.class.getName());
	
	@RequestMapping("/listarCheck")
	public String vercheck(Model m) {
		List<Checklist> listacheck = chk.listaCheck();
		m.addAttribute("listcheck", listacheck);
		return "listadocheck";
	}
	
	@RequestMapping("/checkform")
	public String muestracheck(Model m, Model mo, HttpServletRequest request) {
		Principal principal = request.getUserPrincipal();
		String name = principal.getName();
		int username = Integer.parseInt(name);
		mo.addAttribute("id", username);
		m.addAttribute("command", new Checklist());
		return "checkform";
	}
	
	@RequestMapping(value="/eliminacheck/{idChecklist}")
	public String eliminacheck(@PathVariable int idChecklist, Model mo){
	chk.deleteChecklist(idChecklist);
	return "redirect:/listacheck";
	}
	
	@RequestMapping(value="/editcheck/{idChecklist}")
	public String editCheck(@PathVariable int idChecklist, Model modelo){
	Checklist chec = chk.findCheckByid(idChecklist);
	modelo.addAttribute("command", chec);
	return "editlistcheck";
	}
		
	@RequestMapping(value="/cambiacheck", method= RequestMethod.POST)
	public String cambiadatoscheck(Checklist check) {
	chk.updateChecklist(check);
	return "redirect:/listacheck";
	}
	
	@RequestMapping(value="/savecheck", method = RequestMethod.POST)
	public String guardaCheck(@ModelAttribute("chkl") Checklist chkl) {
	chk.addCheck(chkl);	
	return "redirect:/listacheck";
	}
	
	
	
	
	
	
	
}
