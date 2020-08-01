package cl.m5d12.servicio;

import java.util.List;

import cl.m5d12.dao.Accidente;

public interface AccidenteServicio {
	
	Accidente findAccidenteByid(long idAccidente);
	List<Accidente> listaAccidente();
	void addAccidente(Accidente acc);
	void deleteAccidente(int idAccidente);
	void updateAccidente(Accidente acc);
	
	
	

}
