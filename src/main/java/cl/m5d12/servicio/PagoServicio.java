package cl.m5d12.servicio;

import java.util.List;

import cl.m5d12.dao.Pago;

public interface PagoServicio {

	Pago findPagoByid(int pagoCli);
	List<Pago> listaPago();
	void addPago(Pago pag);
	void deletePago(int pagoCli);
	void updatePago(Pago pag);
	
}
