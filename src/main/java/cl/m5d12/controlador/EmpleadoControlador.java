package cl.m5d12.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.m5d12.dao.Empleado;
import cl.m5d12.servicio.EmpleadoServicio;

@Controller
public class EmpleadoControlador {

	@Autowired
	EmpleadoServicio es;
	
	
	 @RequestMapping("/empform")    
	    public String showformEmp(Model m){
	        m.addAttribute("command", new Empleado());
	        return "empform";
	    } 
	 
	 
}
