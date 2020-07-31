package cl.m5d12.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CHECKLIST database table.
 * 
 */
@Entity
@NamedQuery(name="Checklist.findAll", query="SELECT c FROM Checklist c")
public class Checklist implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_CHECKLIST")
	private long idChecklist;

	@Column(name="DETALLE_CHEQUEO")
	private String detalleChequeo;

	private String estado;

	//bi-directional many-to-one association to Visita
	@ManyToOne
	@JoinColumn(name="ID_VISITAS")
	private Visita visita;

	
	//Constructor
	public Checklist() {
		
	}	

	public Checklist(long idChecklist, String detalleChequeo, String estado) {
		super();
		this.idChecklist = idChecklist;
		this.detalleChequeo = detalleChequeo;
		this.estado = estado;
	}
	
	public Checklist(long idChecklist, String detalleChequeo, String estado, Visita visita) {
		super();
		this.idChecklist = idChecklist;
		this.detalleChequeo = detalleChequeo;
		this.estado = estado;
		this.visita = visita;
	}
	
	//Getters and Setters

	public long getIdChecklist() {
		return this.idChecklist;
	}

	public void setIdChecklist(long idChecklist) {
		this.idChecklist = idChecklist;
	}

	public String getDetalleChequeo() {
		return this.detalleChequeo;
	}

	public void setDetalleChequeo(String detalleChequeo) {
		this.detalleChequeo = detalleChequeo;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Visita getVisita() {
		return this.visita;
	}

	public void setVisita(Visita visita) {
		this.visita = visita;
	}

}