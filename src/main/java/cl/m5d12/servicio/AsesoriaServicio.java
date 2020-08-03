package cl.m5d12.servicio;

import java.util.List;

import cl.m5d12.dao.Asesoria;

public interface AsesoriaServicio {

	Asesoria findAsesoriaByid(int idAseso);
	List<Asesoria> listaAseso();
	void addAsesoria(Asesoria Aseso);
	void deleteAsesoria(int idAsesoria);
	void updateAsesoria(Asesoria Aseso);
	/* List<Asesoria> listaporcliente(int idAsesoria); */
	
}
