package cl.m5d12.dao;

import javax.persistence.*;


/**
 * The persistent class for the CAPACITACION database table.
 * 
 */
@Entity
public class Capacitacion  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Capacitacion_generator")
	@SequenceGenerator(name="Capacitacion_generator", sequenceName = "CAPACITACION_SEQ")
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
	private String rutCli;

	//Constructor
	public Capacitacion() {
		super();
	}

	public Capacitacion(int idCapa, String detalleCapa, String estadoSolicitud, String fechaCapa, String nombreCapa,
			String rutCli) {
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

	public String getRutCli() {
		return rutCli;
	}

	public void setRutCli(String rutCli) {
		this.rutCli = rutCli;
	}

		

}