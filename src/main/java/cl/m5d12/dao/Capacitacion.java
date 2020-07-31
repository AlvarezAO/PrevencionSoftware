package cl.m5d12.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the CAPACITACION database table.
 * 
 */
@Entity
@NamedQuery(name="Capacitacion.findAll", query="SELECT c FROM Capacitacion c")
public class Capacitacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_CAPA")
	private long idCapa;

	@Column(name="DETALLE_CAPA")
	private String detalleCapa;

	@Column(name="ESTADO_SOLICITUD")
	private String estadoSolicitud;

	@Column(name="FECHA_CAPA")
	private String fechaCapa;

	@Column(name="NOMBRE_CAPA")
	private String nombreCapa;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="RUT_CLI")
	private Cliente cliente;

	//bi-directional many-to-one association to Visita
	@OneToMany(mappedBy="capacitacion")
	private List<Visita> visitas;

	//Constructor
	public Capacitacion() {
		
	}	

	public Capacitacion(long idCapa, String detalleCapa, String estadoSolicitud, String fechaCapa, String nombreCapa) {
		super();
		this.idCapa = idCapa;
		this.detalleCapa = detalleCapa;
		this.estadoSolicitud = estadoSolicitud;
		this.fechaCapa = fechaCapa;
		this.nombreCapa = nombreCapa;
	}

	public Capacitacion(long idCapa, String detalleCapa, String estadoSolicitud, String fechaCapa, String nombreCapa,
			Cliente cliente) {
		super();
		this.idCapa = idCapa;
		this.detalleCapa = detalleCapa;
		this.estadoSolicitud = estadoSolicitud;
		this.fechaCapa = fechaCapa;
		this.nombreCapa = nombreCapa;
		this.cliente = cliente;
	}	

	public Capacitacion(long idCapa, String detalleCapa, String estadoSolicitud, String fechaCapa, String nombreCapa,
			Cliente cliente, List<Visita> visitas) {
		super();
		this.idCapa = idCapa;
		this.detalleCapa = detalleCapa;
		this.estadoSolicitud = estadoSolicitud;
		this.fechaCapa = fechaCapa;
		this.nombreCapa = nombreCapa;
		this.cliente = cliente;
		this.visitas = visitas;
	}
	
	//Getters and Setters

	public long getIdCapa() {
		return this.idCapa;
	}

	public void setIdCapa(long idCapa) {
		this.idCapa = idCapa;
	}

	public String getDetalleCapa() {
		return this.detalleCapa;
	}

	public void setDetalleCapa(String detalleCapa) {
		this.detalleCapa = detalleCapa;
	}

	public String getEstadoSolicitud() {
		return this.estadoSolicitud;
	}

	public void setEstadoSolicitud(String estadoSolicitud) {
		this.estadoSolicitud = estadoSolicitud;
	}

	public String getFechaCapa() {
		return this.fechaCapa;
	}

	public void setFechaCapa(String fechaCapa) {
		this.fechaCapa = fechaCapa;
	}

	public String getNombreCapa() {
		return this.nombreCapa;
	}

	public void setNombreCapa(String nombreCapa) {
		this.nombreCapa = nombreCapa;
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
		visita.setCapacitacion(this);

		return visita;
	}

	public Visita removeVisita(Visita visita) {
		getVisitas().remove(visita);
		visita.setCapacitacion(null);

		return visita;
	}

}