package cl.m5d12.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.m5d12.dao.Pago;
import cl.m5d12.dao.PagoRepository;

@Service
public class PagoImple implements PagoServicio {
	
	@Autowired
	PagoRepository pago;
		
	@Override
	public Pago findPagoByid(int pagoCli) {
		return pago.findOne(pagoCli);
	}

	@Override
	public List<Pago> listaPago() {
		
		return (List<Pago>) pago.findAll();
	}

	@Override
	public void addPago(Pago pag) {
	   pago.save(pag);
		
	}

	@Override
	public void deletePago(int pagoCli) {
		pago.delete(pagoCli);
		
	}

	@Override
	public void updatePago(Pago pag) {
		pago.save(pag);
		
	}

	
}
