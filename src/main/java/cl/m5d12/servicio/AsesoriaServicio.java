package cl.m5d12.servicio;

import java.util.List;

import cl.m5d12.dao.Asesoria;

public interface AsesoriaServicio {

	Asesoria findClienteByid(long idAseso);
	List<Asesoria> listaAseso();
	void addAsesoria(Asesoria Aseso);
	void deleteAsesoria(long idAsesoria);
	void updateAsesoria(Asesoria Aseso);
	
}
