package cl.m5d12.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ACCIDENTE database table.
 * 
 */
@Entity
@NamedQuery(name="Accidente.findAll", query="SELECT a FROM Accidente a")
public class Accidente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_ACCIDENTE")
	private long idAccidente;

	@Column(name="DETALLE_ACCIDENTE")
	private String detalleAccidente;

	@Column(name="ESTADO_SOLICITUD")
	private String estadoSolicitud;

	@Column(name="FECHA_ACCIDENTE")
	private String fechaAccidente;

	@Column(name="NOMBRE_ACCIDENTE")
	private String nombreAccidente;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="RUT_CLI")
	private Cliente cliente;

	//bi-directional many-to-one association to Visita
	@OneToMany(mappedBy="accidente")
	private List<Visita> visitas;

	//Constructor
	public Accidente() {
		
	}	

	public Accidente(long idAccidente, String detalleAccidente, String estadoSolicitud, String fechaAccidente,
			String nombreAccidente) {
		super();
		this.idAccidente = idAccidente;
		this.detalleAccidente = detalleAccidente;
		this.estadoSolicitud = estadoSolicitud;
		this.fechaAccidente = fechaAccidente;
		this.nombreAccidente = nombreAccidente;
	}
	
	public Accidente(long idAccidente, String detalleAccidente, String estadoSolicitud, String fechaAccidente,
			String nombreAccidente, Cliente cliente) {
		super();
		this.idAccidente = idAccidente;
		this.detalleAccidente = detalleAccidente;
		this.estadoSolicitud = estadoSolicitud;
		this.fechaAccidente = fechaAccidente;
		this.nombreAccidente = nombreAccidente;
		this.cliente = cliente;
	}
	
	public Accidente(long idAccidente, String detalleAccidente, String estadoSolicitud, String fechaAccidente,
			String nombreAccidente, Cliente cliente, List<Visita> visitas) {
		super();
		this.idAccidente = idAccidente;
		this.detalleAccidente = detalleAccidente;
		this.estadoSolicitud = estadoSolicitud;
		this.fechaAccidente = fechaAccidente;
		this.nombreAccidente = nombreAccidente;
		this.cliente = cliente;
		this.visitas = visitas;
	}
	
	//Getters and Setters

	public long getIdAccidente() {
		return this.idAccidente;
	}

	public void setIdAccidente(long idAccidente) {
		this.idAccidente = idAccidente;
	}

	public String getDetalleAccidente() {
		return this.detalleAccidente;
	}

	public void setDetalleAccidente(String detalleAccidente) {
		this.detalleAccidente = detalleAccidente;
	}

	public String getEstadoSolicitud() {
		return this.estadoSolicitud;
	}

	public void setEstadoSolicitud(String estadoSolicitud) {
		this.estadoSolicitud = estadoSolicitud;
	}

	public String getFechaAccidente() {
		return this.fechaAccidente;
	}

	public void setFechaAccidente(String fechaAccidente) {
		this.fechaAccidente = fechaAccidente;
	}

	public String getNombreAccidente() {
		return this.nombreAccidente;
	}

	public void setNombreAccidente(String nombreAccidente) {
		this.nombreAccidente = nombreAccidente;
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
		visita.setAccidente(this);

		return visita;
	}

	public Visita removeVisita(Visita visita) {
		getVisitas().remove(visita);
		visita.setAccidente(null);

		return visita;
	}

}