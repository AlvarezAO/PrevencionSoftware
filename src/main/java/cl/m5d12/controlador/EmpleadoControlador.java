package cl.m5d12.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.m5d12.dao.Cliente;
import cl.m5d12.dao.Empleado;
import cl.m5d12.servicio.EmpleadoServicio;

@Controller
public class EmpleadoControlador {

	@Autowired
	EmpleadoServicio es;
	
	
	 @RequestMapping("/empform")    
	    public String showformEmp(Model m){
	        m.addAttribute("command", new Empleado());
	        return "empform";
	    } 
	 	 
	 @RequestMapping("/listarempleados")
	 public String showListPro(Model m) {
		 List<Empleado> listPro = es.listaEmpleado();
		 m.addAttribute("lEmpleado", listPro);
		 return "listadopro";
	 }
	 
	 @RequestMapping(value="/savepro", method = RequestMethod.POST)
	 public String guardaPro(Empleado emp) {
		 es.addEmpleado(emp);
		 return "redirect:/listarempleados";
	 }
	 
	 @RequestMapping(value="eliminarempleaod/{rutEmp}")
	 public String eliminaPro(@PathVariable int rutEmp) {
		 es.deleteEmpleado(rutEmp);
		 return "redirect:/listarempleados";
	 }
	 
	 @RequestMapping(value="/editempleado")
	 public String editaPro(@PathVariable int rutEmp, Model mo) {	 
	  Empleado em = es.findEmpleadoByid(rutEmp);
	  mo.addAttribute("command", em);
		 return "editaempleado";
	 }
	 
	 @RequestMapping(value="/cambiospro", method = RequestMethod.POST) 
	    public String guardaCambio(Empleado emp){
	        es.updateEmpleado(emp);
			return "redirect:/listarempleados";
	    }
	 
	 
	 
	 
}
