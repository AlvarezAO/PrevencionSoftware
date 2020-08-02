package cl.m5d12.dao;

import javax.persistence.*;

/**
 * The persistent class for the PAGO database table.
 * 
 */
@Entity
public class Pago  {
	

	@Id
	@Column(name="ID_PAGO")
	private int idPago;

	@Column(name="FECHA_PAGO")
	private String fechaPago;

	@Column(name="FECHA_VENCIMIENTO")
	private String fechaVencimiento;

	@Column(name="MONTO_PAGADO")
	private int montoPagado;

	@Column(name="MONTO_TOTAL")
	private int montoTotal;

	@Column(name="RUT_CLI")
	private int rutCli;

	//Constructor
	public Pago() {
		
	}

	public Pago(int idPago, String fechaPago, String fechaVencimiento, int montoPagado, int montoTotal,
			int rutCli) {
		super();
		this.idPago = idPago;
		this.fechaPago = fechaPago;
		this.fechaVencimiento = fechaVencimiento;
		this.montoPagado = montoPagado;
		this.montoTotal = montoTotal;
		this.rutCli = rutCli;
	}


	//Getters and Setters


	public int getIdPago() {
		return idPago;
	}



	public void setIdPago(int idPago) {
		this.idPago = idPago;
	}



	public String getFechaPago() {
		return fechaPago;
	}



	public void setFechaPago(String fechaPago) {
		this.fechaPago = fechaPago;
	}



	public String getFechaVencimiento() {
		return fechaVencimiento;
	}



	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}



	public int getMontoPagado() {
		return montoPagado;
	}



	public void setMontoPagado(int montoPagado) {
		this.montoPagado = montoPagado;
	}



	public int getMontoTotal() {
		return montoTotal;
	}



	public void setMontoTotal(int montoTotal) {
		this.montoTotal = montoTotal;
	}



	public int getRutCli() {
		return rutCli;
	}



	public void setRutCli(int rutCli) {
		this.rutCli = rutCli;
	}

}