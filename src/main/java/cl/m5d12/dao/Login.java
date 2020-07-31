package cl.m5d12.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the LOGIN database table.
 * 
 */
@Entity
@NamedQuery(name="Login.findAll", query="SELECT l FROM Login l")
public class Login implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_LOGIN")
	private long idLogin;

	private String rol;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="RUT_CLI")
	private Cliente cliente;

	//bi-directional many-to-one association to Empleado
	@ManyToOne
	@JoinColumn(name="RUT_EMP")
	private Empleado empleado;

	
	//Constructor
	public Login() {
		
	}	

	public Login(long idLogin, String rol, Cliente cliente) {
		super();
		this.idLogin = idLogin;
		this.rol = rol;
		this.cliente = cliente;
	}
	
	public Login(long idLogin, String rol, Empleado empleado) {
		super();
		this.idLogin = idLogin;
		this.rol = rol;
		this.empleado = empleado;
	}

	//Getters and Setters
	public long getIdLogin() {
		return this.idLogin;
	}

	public void setIdLogin(long idLogin) {
		this.idLogin = idLogin;
	}

	public String getRol() {
		return this.rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Empleado getEmpleado() {
		return this.empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

}