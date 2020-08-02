package cl.m5d12.servicio;

import java.util.List;

import cl.m5d12.dao.Capacitacion;

public interface CapacitacionServicio {
	
	Capacitacion findCapacitacionByid(long idCapa);
	List<Capacitacion> listacapacitacion();
	void addCapa(Capacitacion cap);
	void deleteCapa(int idCapa);
	void updateCapa(Capacitacion cap);

}
