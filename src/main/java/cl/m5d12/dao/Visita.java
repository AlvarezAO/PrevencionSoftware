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
	private long idVisitas;

	@Column(name="CANT_ASISTENTES")
	private BigDecimal cantAsistentes;

	private String direccion;

	private String fecha;

	//bi-directional many-to-one association to Checklist
	@OneToMany(mappedBy="visita")
	private List<Checklist> checklists;

	//bi-directional many-to-one association to Accidente
	@ManyToOne
	@JoinColumn(name="ID_ACCIDENTE")
	private Accidente accidente;

	//bi-directional many-to-one association to Asesoria
	@ManyToOne
	@JoinColumn(name="ID_ASESO")
	private Asesoria asesoria;

	//bi-directional many-to-one association to Capacitacion
	@ManyToOne
	@JoinColumn(name="ID_CAPA")
	private Capacitacion capacitacion;

	//bi-directional many-to-one association to Empleado
	@ManyToOne
	@JoinColumn(name="RUT_EMP")
	private Empleado empleado;

	public Visita() {
	}

	public long getIdVisitas() {
		return this.idVisitas;
	}

	public void setIdVisitas(long idVisitas) {
		this.idVisitas = idVisitas;
	}

	public BigDecimal getCantAsistentes() {
		return this.cantAsistentes;
	}

	public void setCantAsistentes(BigDecimal cantAsistentes) {
		this.cantAsistentes = cantAsistentes;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFecha() {
		return this.fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public List<Checklist> getChecklists() {
		return this.checklists;
	}

	public void setChecklists(List<Checklist> checklists) {
		this.checklists = checklists;
	}

	public Checklist addChecklist(Checklist checklist) {
		getChecklists().add(checklist);
		checklist.setVisita(this);

		return checklist;
	}

	public Checklist removeChecklist(Checklist checklist) {
		getChecklists().remove(checklist);
		checklist.setVisita(null);

		return checklist;
	}

	public Accidente getAccidente() {
		return this.accidente;
	}

	public void setAccidente(Accidente accidente) {
		this.accidente = accidente;
	}

	public Asesoria getAsesoria() {
		return this.asesoria;
	}

	public void setAsesoria(Asesoria asesoria) {
		this.asesoria = asesoria;
	}

	public Capacitacion getCapacitacion() {
		return this.capacitacion;
	}

	public void setCapacitacion(Capacitacion capacitacion) {
		this.capacitacion = capacitacion;
	}

	public Empleado getEmpleado() {
		return this.empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

}