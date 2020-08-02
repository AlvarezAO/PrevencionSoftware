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
	@SequenceGenerator(name = "idCapaGenerator", sequenceName = "CAPACITACION_SEQ")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "idCapaGenerator")
	@Column(name="ID_CAPA")
	private int idCapa;

	@Column(name="DETALLE_CAPA")
	private String detalleCapa;

	@Column(name="ESTADO_SOLICITUD")
	private String estadoSolicitud;

	@Column(name="FECHA_CAPA")
	private String fechaCapa;

	@Column(name="NOMBRE_CAPA")
	private String nombreCapa;

	@Column(name="RUT_CLI")
	private int rutCli;

	//Constructor
	public Capacitacion() {
		
	}

	public Capacitacion(int idCapa, String detalleCapa, String fechaCapa, String nombreCapa, int rutCli) {
		super();
		this.idCapa = idCapa;
		this.detalleCapa = detalleCapa;
		this.fechaCapa = fechaCapa;
		this.nombreCapa = nombreCapa;
		this.rutCli = rutCli;
	}

	public Capacitacion(int idCapa, String detalleCapa, String estadoSolicitud, String fechaCapa, String nombreCapa,
			int rutCli) {
		super();
		this.idCapa = idCapa;
		this.detalleCapa = detalleCapa;
		this.estadoSolicitud = estadoSolicitud;
		this.fechaCapa = fechaCapa;
		this.nombreCapa = nombreCapa;
		this.rutCli = rutCli;
	}
	
	//Getters and Setters

	public long getidCapa() {
		return idCapa;
	}

	public void setidCapa(int idCapa) {
		this.idCapa = idCapa;
	}

	public String getDetalleCapa() {
		return detalleCapa;
	}

	public void setDetalleCapa(String detalleCapa) {
		this.detalleCapa = detalleCapa;
	}

	public String getEstadoSolicitud() {
		return estadoSolicitud;
	}

	public void setEstadoSolicitud(String estadoSolicitud) {
		this.estadoSolicitud = estadoSolicitud;
	}

	public String getFechaCapa() {
		return fechaCapa;
	}

	public void setFechaCapa(String fechaCapa) {
		this.fechaCapa = fechaCapa;
	}

	public String getNombreCapa() {
		return nombreCapa;
	}

	public void setNombreCapa(String nombreCapa) {
		this.nombreCapa = nombreCapa;
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