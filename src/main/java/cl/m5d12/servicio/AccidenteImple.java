package cl.m5d12.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.m5d12.dao.Accidente;
import cl.m5d12.dao.AccidenteRepository;

@Service
public class AccidenteImple implements AccidenteServicio{

	@Autowired
	AccidenteRepository ar;
	
	@Override
	public Accidente findAccidenteByid(int idAccidente) {

		return ar.findOne(idAccidente); 
	}

	@Override
	public List<Accidente> listaAccidente() {
		
		return (List<Accidente>) ar.findAll();
	}

	@Override
	public void addAccidente(Accidente acc) {
		ar.save(acc);
		
	}

	@Override
	public void deleteAccidente(int idAccidente) {
		ar.delete(idAccidente);
		
	}

	@Override
	public void updateAccidente(Accidente acc) {
		ar.save(acc);
		
	}

}
