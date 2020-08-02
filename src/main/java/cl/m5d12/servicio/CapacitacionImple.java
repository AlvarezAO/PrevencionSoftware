package cl.m5d12.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.m5d12.dao.Capacitacion;
import cl.m5d12.dao.CapacitacionRepository;

@Service
public class CapacitacionImple implements CapacitacionServicio {

	
	@Autowired
	CapacitacionRepository caprepo;
	
	@Override
	public Capacitacion findCapacitacionByid(long idCapa) {
		
		return caprepo.findOne((int) idCapa);
	}

	@Override
	public List<Capacitacion> listacapacitacion() {
		
		return (List<Capacitacion>) caprepo.findAll();
	}

	@Override
	public void addCapa(Capacitacion cap) {
		caprepo.save(cap);
		
	}

	@Override
	public void deleteCapa(int idCapa) {
		caprepo.delete(idCapa);
		
	}

	@Override
	public void updateCapa(Capacitacion cap) {
		caprepo.save(cap);
		
	}

}
