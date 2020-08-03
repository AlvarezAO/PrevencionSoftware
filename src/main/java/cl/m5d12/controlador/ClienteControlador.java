package cl.m5d12.controlador;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.m5d12.dao.Cliente;
import cl.m5d12.servicio.ClienteServicio;

@Controller
public class ClienteControlador {

	@Autowired
	ClienteServicio cs;
	
	Logger log = Logger.getLogger(ClienteControlador.class.getName());
	
	@RequestMapping("/listarclientes")
	public String verclientes(Model m) {
		List<Cliente> listacliente = cs.listaCliente();
		m.addAttribute("lclientes",listacliente);
		log.info("Ha visto lista clientes");
		return "listadoclientes";
	}
	
    @RequestMapping("/cliform")    
    public String showform(Model m){
        m.addAttribute("command", new Cliente());
        log.info("Crea formulario cliente");
        return "cliform";
    } 
    
    @RequestMapping("/mainmenu")    
    public String showmenu(Model m) {
        return "mainmenu";
    } 

    @RequestMapping(value="/save",method = RequestMethod.POST)    
    public String save(@ModelAttribute("cli") Cliente cli){ 
    	try {
    		 cs.addCliente(cli);
    	     log.info("Usuario creado correctamente");
		} catch (Exception e) {
			e.getStackTrace();
			log.info("Error al crear usuario");
			return "index";
		}
       
        return "redirect:/listarclientes";
    }
    	
	@RequestMapping("/error")
    public String error(ModelMap model)
    {
        model.addAttribute("error", "true");
        log.info("Error de logueo");
        return "login";

    }

    @RequestMapping("/login")
    public String login()
    {
        
        log.info("Nueva conexion");
        return "login";
    }
    
    @RequestMapping("/logout")
    public String logout()
    {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){    
        	SecurityContextHolder.getContext().setAuthentication(null);
        }
        return "redirect:/login?logout"; //You can redirect wherever you want, but generally it's a good practice to show login screen again.
    }
    
    @RequestMapping(value="/eliminarusuario/{rutCli}")
	public String eliminaUser(@PathVariable int rutCli) {
		cs.deleteCliente(rutCli);
		log.info("Se ha eliminado un usuario " + rutCli);
		return "redirect:/listarclientes";
	}
	
	@RequestMapping(value="/editusuario/{rutCli}")
		public String editaUser(@PathVariable int rutCli, Model modelo) {
		Cliente cli = cs.findClienteByid(rutCli);
		modelo.addAttribute("command", cli);
		log.info("Editando a "+rutCli);
		return "editarcliente";
	}
	
	@RequestMapping(value="/guardacambio", method = RequestMethod.POST) 
    public String guardaCambio(Cliente cli){
		try {
			cs.updateCliente(cli);
	        log.info("Actualizacion correcta");
		} catch (Exception e) {
			e.getStackTrace();
			log.info("Error al actualizar usuario");
			return "cliform";
		}
        
		return "redirect:/listarclientes";
    }

	
	
	
	
}
	

