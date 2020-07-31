package cl.m5d12.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ASESORIA database table.
 * 
 */
@Entity
@NamedQuery(name="Asesoria.findAll", query="SELECT a FROM Asesoria a")
public class Asesoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_ASESO")
	private long idAseso;

	@Column(name="DETALLE_ASESO")
	private String detalleAseso;

	@Column(name="ESTADO_SOLICITUD")
	private String estadoSolicitud;

	@Column(name="FECHA_ASESO")
	private String fechaAseso;

	@Column(name="NOMBRE_ASESO")
	private String nombreAseso;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="RUT_CLI")
	private Cliente cliente;

	//bi-directional many-to-one association to Visita
	@OneToMany(mappedBy="asesoria")
	private List<Visita> visitas;

	public Asesoria() {
	}

	public long getIdAseso() {
		return this.idAseso;
	}

	public void setIdAseso(long idAseso) {
		this.idAseso = idAseso;
	}

	public String getDetalleAseso() {
		return this.detalleAseso;
	}

	public void setDetalleAseso(String detalleAseso) {
		this.detalleAseso = detalleAseso;
	}

	public String getEstadoSolicitud() {
		return this.estadoSolicitud;
	}

	public void setEstadoSolicitud(String estadoSolicitud) {
		this.estadoSolicitud = estadoSolicitud;
	}

	public String getFechaAseso() {
		return this.fechaAseso;
	}

	public void setFechaAseso(String fechaAseso) {
		this.fechaAseso = fechaAseso;
	}

	public String getNombreAseso() {
		return this.nombreAseso;
	}

	public void setNombreAseso(String nombreAseso) {
		this.nombreAseso = nombreAseso;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Visita> getVisitas() {
		return this.visitas;
	}

	public void setVisitas(List<Visita> visitas) {
		this.visitas = visitas;
	}

	public Visita addVisita(Visita visita) {
		getVisitas().add(visita);
		visita.setAsesoria(this);

		return visita;
	}

	public Visita removeVisita(Visita visita) {
		getVisitas().remove(visita);
		visita.setAsesoria(null);

		return visita;
	}

}