package cl.m5d12.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the PAGO database table.
 * 
 */
@Entity
@NamedQuery(name="Pago.findAll", query="SELECT p FROM Pago p")
public class Pago implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_PAGO")
	private long idPago;

	@Column(name="FECHA_PAGO")
	private String fechaPago;

	@Column(name="FECHA_VENCIMIENTO")
	private String fechaVencimiento;

	@Column(name="MONTO_PAGADO")
	private BigDecimal montoPagado;

	@Column(name="MONTO_TOTAL")
	private BigDecimal montoTotal;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="RUT_CLI")
	private Cliente cliente;

	//Constructor
	public Pago() {
		
	}

	public Pago(long idPago, String fechaPago, String fechaVencimiento, BigDecimal montoPagado, BigDecimal montoTotal,
			Cliente cliente) {
		super();
		this.idPago = idPago;
		this.fechaPago = fechaPago;
		this.fechaVencimiento = fechaVencimiento;
		this.montoPagado = montoPagado;
		this.montoTotal = montoTotal;
		this.cliente = cliente;
	}

	//Getters and Setters

	public long getIdPago() {
		return this.idPago;
	}

	public void setIdPago(long idPago) {
		this.idPago = idPago;
	}

	public String getFechaPago() {
		return this.fechaPago;
	}

	public void setFechaPago(String fechaPago) {
		this.fechaPago = fechaPago;
	}

	public String getFechaVencimiento() {
		return this.fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public BigDecimal getMontoPagado() {
		return this.montoPagado;
	}

	public void setMontoPagado(BigDecimal montoPagado) {
		this.montoPagado = montoPagado;
	}

	public BigDecimal getMontoTotal() {
		return this.montoTotal;
	}

	public void setMontoTotal(BigDecimal montoTotal) {
		this.montoTotal = montoTotal;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}