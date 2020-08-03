package cl.m5d12.controlador;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.m5d12.dao.Visita;
import cl.m5d12.servicio.VisitaServicio;

@Controller
public class VisitaControlador {
	
	@Autowired
	VisitaServicio visita;
	
	Logger log = Logger.getLogger(VisitaControlador.class.getName());
	
	@RequestMapping("/listarvisitas")
	public String vervisita(Model m) {
		List<Visita> listavisita = visita.listaVisita();
		m.addAttribute("listvisita", listavisita);
		log.info("Se ha visto lista de visitas");
		return "listadovisitas";
	}
	
}
