package cl.m5d12.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	 @RequestMapping("/mainmenu")    
	    public String showmenu(Model m) {
	        return "login";
	    } 

}
