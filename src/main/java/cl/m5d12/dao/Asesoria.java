package cl.m5d12.dao;

import javax.persistence.*;


/**
 * The persistent class for the ASESORIA database table.
 * 
 */
@Entity
public class Asesoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "asesoria_generator")
	@SequenceGenerator(name="asesoria_generator", sequenceName = "ASESORIA_SEQ")
	@Column(name="ID_ASESO")
	private int idAseso;

	@Column(name="DETALLE_ASESO")
	private String detalleAseso;	

	@Column(name="ESTADO_SOLICITUD")
	private String estadoSolicitud;

	@Column(name="FECHA_ASESO")
	private String fechaAseso;

	@Column(name="NOMBRE_ASESO")
	private String nombreAseso;

	@Column(name="RUT_CLI")
	private String rutCli;

	//Constructor
	
	public Asesoria() {
		super();
	}

	public Asesoria(int idAseso, String detalleAseso, String estadoSolicitud, String fechaAseso, String nombreAseso,
			String rutCli) {
		super();
		this.idAseso = idAseso;
		this.detalleAseso = detalleAseso;
		this.estadoSolicitud = estadoSolicitud;
		this.fechaAseso = fechaAseso;
		this.nombreAseso = nombreAseso;
		this.rutCli = rutCli;
	}

	//Getters and Setters
	
	public int getIdAseso() {
		return idAseso;
	}

	public void setIdAseso(int idAseso) {
		this.idAseso = idAseso;
	}

	public String getDetalleAseso() {
		return detalleAseso;
	}

	public void setDetalleAseso(String detalleAseso) {
		this.detalleAseso = detalleAseso;
	}

	public String getEstadoSolicitud() {
		return estadoSolicitud;
	}

	public void setEstadoSolicitud(String estadoSolicitud) {
		this.estadoSolicitud = estadoSolicitud;
	}

	public String getFechaAseso() {
		return fechaAseso;
	}

	public void setFechaAseso(String fechaAseso) {
		this.fechaAseso = fechaAseso;
	}

	public String getNombreAseso() {
		return nombreAseso;
	}

	public void setNombreAseso(String nombreAseso) {
		this.nombreAseso = nombreAseso;
	}

	public String getRutCli() {
		return rutCli;
	}

	public void setRutCli(String rutCli) {
		this.rutCli = rutCli;
	}



	
	
}	