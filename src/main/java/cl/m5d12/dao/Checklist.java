package cl.m5d12.dao;

import javax.persistence.*;
/**
 * The persistent class for the CHECKLIST database table.
 * 
 */
@Entity

public class Checklist  {
	

	@Id
	@Column(name="ID_CHECKLIST")
	private int idChecklist;

	@Column(name="DETALLE_CHEQUEO")
	private String detalleChequeo;

	@Column(name="ESTADO")
	private String estado;

	@Column(name="ID_VISITAS")
	private int idVisitas;

	
	//Constructor
	public Checklist() {
		
	}
	
	public Checklist(int idChecklist, String detalleChequeo, int idVisitas) {
		super();
		this.idChecklist = idChecklist;
		this.detalleChequeo = detalleChequeo;
		this.idVisitas = idVisitas;
	}

	public Checklist(int idChecklist, String detalleChequeo, String estado, int idVisitas) {
		super();
		this.idChecklist = idChecklist;
		this.detalleChequeo = detalleChequeo;
		this.estado = estado;
		this.idVisitas = idVisitas;
	}

	public int getIdChecklist() {
		return idChecklist;
	}

	public void setIdChecklist(int idChecklist) {
		this.idChecklist = idChecklist;
	}

	public String getDetalleChequeo() {
		return detalleChequeo;
	}

	public void setDetalleChequeo(String detalleChequeo) {
		this.detalleChequeo = detalleChequeo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getIdVisitas() {
		return idVisitas;
	}

	public void setIdVisitas(int idVisitas) {
		this.idVisitas = idVisitas;
	}

			
	
		
}