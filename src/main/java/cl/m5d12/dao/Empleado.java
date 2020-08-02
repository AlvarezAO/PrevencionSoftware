package cl.m5d12.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the EMPLEADO database table.
 * 
 */
@Entity
@NamedQuery(name="Empleado.findAll", query="SELECT e FROM Empleado e")
public class Empleado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="RUT_EMP")
	private int rutEmp;

	@Column(name="EMAIL_EMP")
	private String emailEmp;

	@Column(name="FONO_EMP")
	private BigDecimal fonoEmp;

	@Column(name="NOMBRE_EMP")
	private String nombreEmp;

	
	
	//Constructor
	public Empleado() {
		
	}
	
	public Empleado(int rutEmp, String emailEmp, BigDecimal fonoEmp, String nombreEmp) {
		
		this.rutEmp = rutEmp;
		this.emailEmp = emailEmp;
		this.fonoEmp = fonoEmp;
		this.nombreEmp = nombreEmp;
	}
	
	//Getters and Setters

	public int getRutEmp() {
		return rutEmp;
	}

	public void setRutEmp(int rutEmp) {
		this.rutEmp = rutEmp;
	}

	public String getEmailEmp() {
		return emailEmp;
	}

	public void setEmailEmp(String emailEmp) {
		this.emailEmp = emailEmp;
	}

	public BigDecimal getFonoEmp() {
		return fonoEmp;
	}

	public void setFonoEmp(BigDecimal fonoEmp) {
		this.fonoEmp = fonoEmp;
	}

	public String getNombreEmp() {
		return nombreEmp;
	}

	public void setNombreEmp(String nombreEmp) {
		this.nombreEmp = nombreEmp;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}