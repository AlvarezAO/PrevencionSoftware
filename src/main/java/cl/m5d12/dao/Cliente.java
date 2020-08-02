package cl.m5d12.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CLIENTE database table.
 * 
 */
@Entity
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="RUT_CLI")
	private int rutCli;

	@Column(name="DIRECCION_CLI")
	private String direccionCli;

	@Column(name="NOMBRE_CLI")
	private String nombreCli;

	@Column(name="RUBRO_CLI")
	private String rubroCli;

	
	
	//Constructor
	public Cliente() {
		
	}	


	public Cliente(int rutCli, String direccionCli, String nombreCli, String rubroCli) {

		super();
		this.rutCli = rutCli;
		this.direccionCli = direccionCli;
		this.nombreCli = nombreCli;
		this.rubroCli = rubroCli;
	}
	
	//Getters and Setters


	public int getRutCli() {
		return rutCli;
	}


	public void setRutCli(int rutCli) {
		this.rutCli = rutCli;
	}


	public String getDireccionCli() {
		return direccionCli;
	}


	public void setDireccionCli(String direccionCli) {
		this.direccionCli = direccionCli;
	}


	public String getNombreCli() {
		return nombreCli;
	}


	public void setNombreCli(String nombreCli) {
		this.nombreCli = nombreCli;
	}


	public String getRubroCli() {
		return rubroCli;
	}


	public void setRubroCli(String rubroCli) {
		this.rubroCli = rubroCli;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}