package cl.m5d12.servicio;

import java.util.List;

import cl.m5d12.dao.Empleado;

public interface EmpleadoServicio {
	
	Empleado findEmpleadoByid(int rutEmp);
	List<Empleado> listaEmpleado();
	void addEmpleado(Empleado emp);
	void deleteEmpleado(int rutEmp);
	void updateEmpleado(Empleado emp);
	

}
