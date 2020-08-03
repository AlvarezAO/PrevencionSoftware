package cl.m5d12.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.m5d12.dao.Visita;
import cl.m5d12.dao.VisitaRepository;

@Service
public class VisitaImple implements VisitaServicio {

	@Autowired
	VisitaRepository visirepo;
	
	@Override
	public Visita findVisitaByid(int idVisitas) {
		
		return visirepo.findOne(idVisitas);
	}

	@Override
	public List<Visita> listaVisita() {
		
		return (List<Visita>) visirepo.findAll();
	}

	@Override
	public void addVisita(Visita visita) {
		
		visirepo.save(visita);
		
	}

	@Override
	public void deleteVisita(int idVisitas) {
		
		visirepo.delete(idVisitas);
		
	}

	@Override
	public void updateVisita(Visita visita) {
		visirepo.save(visita);
		
	}
	
	

}
