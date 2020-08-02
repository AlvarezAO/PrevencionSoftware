package cl.m5d12.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import cl.m5d12.dao.Asesoria;
import cl.m5d12.dao.AsesoriaRepository;

@Service
public class AsesoriaImple implements AsesoriaServicio{

	@Autowired
	AsesoriaRepository as;

	@Override
	public Asesoria findAsesoriaByid(int idAseso) {
		return as.findOne(idAseso);
	}

	@Override
	public List<Asesoria> listaAseso() {
		return (List<Asesoria>) as.findAll();
	}

	@Override
	public void addAsesoria(Asesoria Aseso) {
		as.save(Aseso);
		
	}

	@Override
	public void deleteAsesoria(int idAsesoria) {
		as.delete(idAsesoria);
		
	}

	@Override
	public void updateAsesoria(Asesoria Aseso) {
		as.save(Aseso);
		
	}


}
	