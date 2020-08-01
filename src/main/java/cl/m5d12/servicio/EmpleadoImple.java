package cl.m5d12.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.m5d12.dao.Empleado;
import cl.m5d12.dao.EmpleadoRepository;

@Service
public class EmpleadoImple implements EmpleadoServicio {
	
	@Autowired
	EmpleadoRepository emprepo;

	@Override
	public Empleado findEmpleadoByid(int rutEmp) {
		
		return emprepo.findOne(rutEmp);
	}

	@Override
	public List<Empleado> listaEmpleado() {
		
		return (List<Empleado>) emprepo.findAll();
	}

	@Override
	public void addEmpleado(Empleado emp) {
		emprepo.save(emp);
		
	}

	@Override
	public void deleteEmpleado(int rutEmp) {
		emprepo.delete(rutEmp);
		
	}

	@Override
	public void updateEmpleado(Empleado emp) {
		emprepo.save(emp);
		
	}
	
	

}
