package cl.m5d12.controlador;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cl.m5d12.servicio.AccidenteServicio;

@Controller
public class AccidenteControlador {
	
	@Autowired
	AccidenteServicio acc;
	
	Logger log = Logger.getLogger(AsesoriaControlador.class.getName());
	
	

}
