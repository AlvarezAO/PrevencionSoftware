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

	

	
	//Constructor
	public Asesoria() {
		
	}		

	public Asesoria(long idAseso, String detalleAseso, String fechaAseso, String nombreAseso) {
		super();
		this.idAseso = idAseso;
		this.detalleAseso = detalleAseso;
		this.fechaAseso = fechaAseso;
		this.nombreAseso = nombreAseso;
	}

	public Asesoria(long idAseso, String detalleAseso, String estadoSolicitud, String fechaAseso, String nombreAseso) {
		super();
		this.idAseso = idAseso;
		this.detalleAseso = detalleAseso;
		this.estadoSolicitud = estadoSolicitud;
		this.fechaAseso = fechaAseso;
		this.nombreAseso = nombreAseso;
	}
	
	//Getters and Setters

	public long getIdAseso() {
		return idAseso;
	}

	public void setIdAseso(long idAseso) {
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
	
}