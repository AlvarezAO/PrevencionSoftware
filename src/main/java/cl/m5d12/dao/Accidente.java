package cl.m5d12.dao;

import java.io.Serializable;
import javax.persistence.*;


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

	@Column(name="RUT_CLI")
	private int rutCli;

	//Constructor
	public Accidente() {
		
	}		
	
	public Accidente(long idAccidente, String detalleAccidente, String fechaAccidente, String nombreAccidente,
			int rutCli) {
		super();
		this.idAccidente = idAccidente;
		this.detalleAccidente = detalleAccidente;
		this.fechaAccidente = fechaAccidente;
		this.nombreAccidente = nombreAccidente;
		this.rutCli = rutCli;
	}
	
	public Accidente(long idAccidente, String detalleAccidente, String estadoSolicitud, String fechaAccidente,
			String nombreAccidente, int rutCli) {
		super();
		this.idAccidente = idAccidente;
		this.detalleAccidente = detalleAccidente;
		this.estadoSolicitud = estadoSolicitud;
		this.fechaAccidente = fechaAccidente;
		this.nombreAccidente = nombreAccidente;
		this.rutCli = rutCli;
	}
	
	//Getters and Setters

	public long getIdAccidente() {
		return idAccidente;
	}

	public void setIdAccidente(long idAccidente) {
		this.idAccidente = idAccidente;
	}

	public String getDetalleAccidente() {
		return detalleAccidente;
	}

	public void setDetalleAccidente(String detalleAccidente) {
		this.detalleAccidente = detalleAccidente;
	}

	public String getEstadoSolicitud() {
		return estadoSolicitud;
	}

	public void setEstadoSolicitud(String estadoSolicitud) {
		this.estadoSolicitud = estadoSolicitud;
	}

	public String getFechaAccidente() {
		return fechaAccidente;
	}

	public void setFechaAccidente(String fechaAccidente) {
		this.fechaAccidente = fechaAccidente;
	}

	public String getNombreAccidente() {
		return nombreAccidente;
	}

	public void setNombreAccidente(String nombreAccidente) {
		this.nombreAccidente = nombreAccidente;
	}

	public int getRutCli() {
		return rutCli;
	}

	public void setRutCli(int rutCli) {
		this.rutCli = rutCli;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}