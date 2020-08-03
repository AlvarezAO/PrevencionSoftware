package cl.m5d12.controlador;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.m5d12.dao.Empleado;
import cl.m5d12.servicio.EmpleadoServicio;

@Controller
public class EmpleadoControlador {

	@Autowired
	EmpleadoServicio es;
	
	Logger log = Logger.getLogger(AsesoriaControlador.class.getName());
		
	 @RequestMapping("/empform")    
	    public String showformEmp(Model m){
	        m.addAttribute("command", new Empleado());
	        log.info("Crea formulario empleado");
	        return "empform";
	    } 
	 	 
	 @RequestMapping("/listarempleados")
	 public String showListPro(Model m) {
		 List<Empleado> listPro = es.listaEmpleado();
		 m.addAttribute("lEmpleado", listPro);
		 log.info("Ha listado los empleados");
		 return "listadopro";
	 }
	 
	 @RequestMapping(value="/savepro", method = RequestMethod.POST)
	 public String guardaPro(Empleado emp) {
		 try {
			 es.addEmpleado(emp);
			 log.info("Ha creado nuevo empleado");
		} catch (Exception e) {
			e.getStackTrace();
			log.info("Error al crear empleado");
			return "empform";
		}
		 
		 return "redirect:/listarempleados";
	 }
	 
	 @RequestMapping(value="eliminarempleaod/{rutEmp}")
	 public String eliminaPro(@PathVariable int rutEmp) {
		 es.deleteEmpleado(rutEmp);
		 log.info("Ha eliminado un empleado");
		 return "redirect:/listarempleados";
	 }
	 
	 @RequestMapping(value="/editempleado")
	 public String editaPro(@PathVariable int rutEmp, Model mo) {	 
	  Empleado em = es.findEmpleadoByid(rutEmp);
	  mo.addAttribute("command", em);
	  log.info("Editando un empleado");
		 return "editaempleado";
	 }
	 
	 @RequestMapping(value="/cambiospro", method = RequestMethod.POST) 
	    public String guardaCambio(Empleado emp){
		 try {
			 es.updateEmpleado(emp);
		     log.info("Edicion guardada de empleado "+emp);
		} catch (Exception e) {
			e.getStackTrace();
			log.info("Error al actualizar empleado");
		}
	        
			return "redirect:/listarempleados";
	    }
	 
	 
	 
	 
}
