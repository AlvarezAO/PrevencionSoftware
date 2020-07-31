package cl.m5d12.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


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

	//bi-directional many-to-one association to Login
	@OneToMany(mappedBy="empleado")
	private List<Login> logins;

	//bi-directional many-to-one association to Visita
	@OneToMany(mappedBy="empleado")
	private List<Visita> visitas;

	
	//Constructor
	public Empleado() {
		
	}
	
	public Empleado(int rutEmp, String emailEmp, BigDecimal fonoEmp, String nombreEmp) {
		
		this.rutEmp = rutEmp;
		this.emailEmp = emailEmp;
		this.fonoEmp = fonoEmp;
		this.nombreEmp = nombreEmp;
	}


	public Empleado(int rutEmp, String emailEmp, BigDecimal fonoEmp, String nombreEmp,
			List<Login> logins) {
		
		this.rutEmp = rutEmp;
		this.emailEmp = emailEmp;
		this.fonoEmp = fonoEmp;
		this.nombreEmp = nombreEmp;
		this.logins = logins;
	}
	

	public Empleado(int rutEmp, String emailEmp, BigDecimal fonoEmp, String nombreEmp,
			List<Login> logins, List<Visita> visitas) {
		
		this.rutEmp = rutEmp;
		this.emailEmp = emailEmp;
		this.fonoEmp = fonoEmp;
		this.nombreEmp = nombreEmp;
		this.logins = logins;
		this.visitas = visitas;
	}


	public int getRutEmp() {
		return this.rutEmp;
	}

	public void setRutEmp(int rutEmp) {
		this.rutEmp = rutEmp;
	}


	public String getEmailEmp() {
		return this.emailEmp;
	}

	public void setEmailEmp(String emailEmp) {
		this.emailEmp = emailEmp;
	}

	public BigDecimal getFonoEmp() {
		return this.fonoEmp;
	}

	public void setFonoEmp(BigDecimal fonoEmp) {
		this.fonoEmp = fonoEmp;
	}

	public String getNombreEmp() {
		return this.nombreEmp;
	}

	public void setNombreEmp(String nombreEmp) {
		this.nombreEmp = nombreEmp;
	}

	public List<Login> getLogins() {
		return this.logins;
	}

	public void setLogins(List<Login> logins) {
		this.logins = logins;
	}

	public Login addLogin(Login login) {
		getLogins().add(login);
		login.setEmpleado(this);

		return login;
	}

	public Login removeLogin(Login login) {
		getLogins().remove(login);
		login.setEmpleado(null);

		return login;
	}

	public List<Visita> getVisitas() {
		return this.visitas;
	}

	public void setVisitas(List<Visita> visitas) {
		this.visitas = visitas;
	}

	public Visita addVisita(Visita visita) {
		getVisitas().add(visita);
		visita.setEmpleado(this);

		return visita;
	}

	public Visita removeVisita(Visita visita) {
		getVisitas().remove(visita);
		visita.setEmpleado(null);

		return visita;
	}

}