package cl.m5d12.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


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

	@Column(name="CLAVE_CLI")
	private String claveCli;

	@Column(name="DIRECCION_CLI")
	private String direccionCli;

	@Column(name="NOMBRE_CLI")
	private String nombreCli;

	@Column(name="RUBRO_CLI")
	private String rubroCli;

	//bi-directional many-to-one association to Accidente
	@OneToMany(mappedBy="cliente")
	private List<Accidente> accidentes;

	//bi-directional many-to-one association to Asesoria
	@OneToMany(mappedBy="cliente")
	private List<Asesoria> asesorias;

	//bi-directional many-to-one association to Capacitacion
	@OneToMany(mappedBy="cliente")
	private List<Capacitacion> capacitacions;

	//bi-directional many-to-one association to Login
	@OneToMany(mappedBy="cliente")
	private List<Login> logins;

	//bi-directional many-to-one association to Pago
	@OneToMany(mappedBy="cliente")
	private List<Pago> pagos;
	
	//Constructor
	public Cliente() {
		
	}	

	public Cliente(int rutCli, String claveCli, String direccionCli, String nombreCli, String rubroCli) {
		super();
		this.rutCli = rutCli;
		this.claveCli = claveCli;
		this.direccionCli = direccionCli;
		this.nombreCli = nombreCli;
		this.rubroCli = rubroCli;
	}

	public Cliente(int rutCli, String claveCli, String direccionCli, String nombreCli, String rubroCli,
			List<Accidente> accidentes, List<Asesoria> asesorias, List<Capacitacion> capacitacions, List<Login> logins,
			List<Pago> pagos) {
		super();
		this.rutCli = rutCli;
		this.claveCli = claveCli;
		this.direccionCli = direccionCli;
		this.nombreCli = nombreCli;
		this.rubroCli = rubroCli;
		this.accidentes = accidentes;
		this.asesorias = asesorias;
		this.capacitacions = capacitacions;
		this.logins = logins;
		this.pagos = pagos;
	}

	//Getters and Setters
	public int getRutCli() {
		return this.rutCli;
	}

	public void setRutCli(int rutCli) {
		this.rutCli = rutCli;
	}

	public String getClaveCli() {
		return this.claveCli;
	}

	public void setClaveCli(String claveCli) {
		this.claveCli = claveCli;
	}

	public String getDireccionCli() {
		return this.direccionCli;
	}

	public void setDireccionCli(String direccionCli) {
		this.direccionCli = direccionCli;
	}

	public String getNombreCli() {
		return this.nombreCli;
	}

	public void setNombreCli(String nombreCli) {
		this.nombreCli = nombreCli;
	}

	public String getRubroCli() {
		return this.rubroCli;
	}

	public void setRubroCli(String rubroCli) {
		this.rubroCli = rubroCli;
	}

	public List<Accidente> getAccidentes() {
		return this.accidentes;
	}

	public void setAccidentes(List<Accidente> accidentes) {
		this.accidentes = accidentes;
	}

	public Accidente addAccidente(Accidente accidente) {
		getAccidentes().add(accidente);
		accidente.setCliente(this);

		return accidente;
	}

	public Accidente removeAccidente(Accidente accidente) {
		getAccidentes().remove(accidente);
		accidente.setCliente(null);

		return accidente;
	}

	public List<Asesoria> getAsesorias() {
		return this.asesorias;
	}

	public void setAsesorias(List<Asesoria> asesorias) {
		this.asesorias = asesorias;
	}

	public Asesoria addAsesoria(Asesoria asesoria) {
		getAsesorias().add(asesoria);
		asesoria.setCliente(this);

		return asesoria;
	}

	public Asesoria removeAsesoria(Asesoria asesoria) {
		getAsesorias().remove(asesoria);
		asesoria.setCliente(null);

		return asesoria;
	}

	public List<Capacitacion> getCapacitacions() {
		return this.capacitacions;
	}

	public void setCapacitacions(List<Capacitacion> capacitacions) {
		this.capacitacions = capacitacions;
	}

	public Capacitacion addCapacitacion(Capacitacion capacitacion) {
		getCapacitacions().add(capacitacion);
		capacitacion.setCliente(this);

		return capacitacion;
	}

	public Capacitacion removeCapacitacion(Capacitacion capacitacion) {
		getCapacitacions().remove(capacitacion);
		capacitacion.setCliente(null);

		return capacitacion;
	}

	public List<Login> getLogins() {
		return this.logins;
	}

	public void setLogins(List<Login> logins) {
		this.logins = logins;
	}

	public Login addLogin(Login login) {
		getLogins().add(login);
		login.setCliente(this);

		return login;
	}

	public Login removeLogin(Login login) {
		getLogins().remove(login);
		login.setCliente(null);

		return login;
	}

	public List<Pago> getPagos() {
		return this.pagos;
	}

	public void setPagos(List<Pago> pagos) {
		this.pagos = pagos;
	}

	public Pago addPago(Pago pago) {
		getPagos().add(pago);
		pago.setCliente(this);

		return pago;
	}

	public Pago removePago(Pago pago) {
		getPagos().remove(pago);
		pago.setCliente(null);

		return pago;
	}

}