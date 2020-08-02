package cl.m5d12.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the VISITA database table.
 * 
 */
@Entity
@NamedQuery(name="Visita.findAll", query="SELECT v FROM Visita v")
public class Visita implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_VISITAS")
	private int idVisitas;

	@Column(name="CANT_ASISTENTES")
	private int cantAsistentes;

	private String direccion;

	private String fecha;


	@Column(name="ID_ACCIDENTE")
	private int idAccidente;

	@Column(name="ID_ASESO")
	private int idAsesoria;

	@Column(name="ID_CAPA")
	private int idCapacitacion;

	@Column(name="RUT_EMP")
	private int idEmpleado;

	
	//Constructor
	public Visita() {
		
	}

	public Visita(int idVisitas, int cantAsistentes, String direccion, String fecha) {
		super();
		this.idVisitas = idVisitas;
		this.cantAsistentes = cantAsistentes;
		this.direccion = direccion;
		this.fecha = fecha;
	}

	public Visita(int idVisitas, int cantAsistentes, String direccion, String fecha, int idAccidente,
			int idAsesoria, int idCapacitacion, int idEmpleado) {
		super();
		this.idVisitas = idVisitas;
		this.cantAsistentes = cantAsistentes;
		this.direccion = direccion;
		this.fecha = fecha;
		this.idAccidente = idAccidente;
		this.idAsesoria = idAsesoria;
		this.idCapacitacion = idCapacitacion;
		this.idEmpleado = idEmpleado;
	}
	
	// Getters and Setters

	public int getIdVisitas() {
		return idVisitas;
	}

	public void setIdVisitas(int idVisitas) {
		this.idVisitas = idVisitas;
	}

	public int getCantAsistentes() {
		return cantAsistentes;
	}

	public void setCantAsistentes(int cantAsistentes) {
		this.cantAsistentes = cantAsistentes;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getIdAccidente() {
		return idAccidente;
	}

	public void setIdAccidente(int idAccidente) {
		this.idAccidente = idAccidente;
	}

	public int getIdAsesoria() {
		return idAsesoria;
	}

	public void setIdAsesoria(int idAsesoria) {
		this.idAsesoria = idAsesoria;
	}

	public int getIdCapacitacion() {
		return idCapacitacion;
	}

	public void setIdCapacitacion(int idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

		
}