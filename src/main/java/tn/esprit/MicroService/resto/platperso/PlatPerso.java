package tn.esprit.MicroService.resto.platperso;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PlatPerso implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue
private Long idPlatPerso;
private String nomPlatPerso;	
private String descrPlatPerso;
public Long getIdPlatPerso() {
	return idPlatPerso;
}
public void setIdPlatPerso(Long idPlatPerso) {
	this.idPlatPerso = idPlatPerso;
}
public String getNomPlatPerso() {
	return nomPlatPerso;
}
public void setNomPlatPerso(String nomPlatPerso) {
	this.nomPlatPerso = nomPlatPerso;
}
public String getDescrPlatPerso() {
	return descrPlatPerso;
}
public void setDescrPlatPerso(String descrPlatPerso) {
	this.descrPlatPerso = descrPlatPerso;
}
public PlatPerso(Long idPlatPerso, String nomPlatPerso, String descrPlatPerso) {
	super();
	this.idPlatPerso = idPlatPerso;
	this.nomPlatPerso = nomPlatPerso;
	this.descrPlatPerso = descrPlatPerso;
}
public PlatPerso() {
	super();
	// TODO Auto-generated constructor stub
}
public PlatPerso(String nomPlatPerso) {
	super();
	this.nomPlatPerso = nomPlatPerso;
}


	
}
