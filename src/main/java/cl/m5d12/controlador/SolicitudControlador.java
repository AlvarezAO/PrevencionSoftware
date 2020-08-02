package cl.m5d12.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SolicitudControlador {
	
	@RequestMapping("/menusolicitudes")
	public String menuSoli() {
		return "menusolicitudes";
	}
	
	
}
