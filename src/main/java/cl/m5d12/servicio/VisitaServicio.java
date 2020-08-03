package cl.m5d12.servicio;

import java.util.List;

import cl.m5d12.dao.Visita;

public interface VisitaServicio {
	
	Visita findVisitaByid(int idVisitas);
	List<Visita> listaVisita();
	void addVisita(Visita visita);
	void deleteVisita(int idVisitas);
	void updateVisita(Visita visita);
	

}
