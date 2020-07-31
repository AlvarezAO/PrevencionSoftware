package cl.m5d12.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.m5d12.dao.Cliente;
import cl.m5d12.dao.ClienteRepository;

@Service
public class ClienteImple implements ClienteServicio {

	@Autowired
	ClienteRepository clirepo;
	@Override
	public Cliente findClienteByid(int rutCli) {
		
		return clirepo.findOne(rutCli);
	}

	@Override
	public List<Cliente> listaCliente() {
		
		return (List<Cliente>) clirepo.findAll();
	}

	@Override
	public void addCliente(Cliente cli) {
		clirepo.save(cli);
		
	}

	@Override
	public void deleteCliente(int rutCli) {
		clirepo.delete(rutCli);
		
	}

	@Override
	public void updateCliente(Cliente cli) {
		clirepo.save(cli);
		
	}

}
