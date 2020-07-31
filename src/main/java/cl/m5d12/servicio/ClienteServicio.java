package cl.m5d12.servicio;

import java.util.List;

import cl.m5d12.dao.Cliente;

public interface ClienteServicio {
	
	Cliente findClienteByid(int rutCli);
	List<Cliente> listaCliente();
	void addCliente(Cliente cli);
	void deleteCliente(int rutCli);
	void updateCliente(Cliente cli);

}
