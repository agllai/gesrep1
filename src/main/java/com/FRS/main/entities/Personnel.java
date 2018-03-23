package com.FRS.main.entities;

import java.io.File;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Personnel implements Serializable{
	@Id @GeneratedValue(strategy= GenerationType.AUTO)
	

private Long ID_Personnel;
private String nom;
private String Prénom;
private File image;
@ManyToOne
@JoinColumn(name="id_boutique")
private Boutique boutique;
private String email;
private String profile ;
private String Domaine_Réparation;
public Personnel() {
	super();
}
public Personnel(String nom, String prénom, File image, Boutique boutique, String email, String profile,String Domaine_Réparation ) {
	super();
	this.nom = nom;
	Prénom = prénom;
	this.image = image;
	this.boutique = boutique;
	this.email = email;
	this.profile = profile;
	this.Domaine_Réparation = Domaine_Réparation;
}

public Long getID_Personnel() {
	return ID_Personnel;
}
public void setID_Personnel(Long iD_Personnel) {
	ID_Personnel = iD_Personnel;
}
public String getDomaine_Réparation() {
	return Domaine_Réparation;
}
public void setDomaine_Réparation(String domaine_Réparation) {
	Domaine_Réparation = domaine_Réparation;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrénom() {
	return Prénom;
}
public void setPrénom(String prénom) {
	Prénom = prénom;
}
public File getImage() {
	return image;
}
public void setImage(File image) {
	this.image = image;
}
public Boutique getBoutique() {
	return boutique;
}
public void setBoutique(Boutique boutique) {
	this.boutique = boutique;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getProfile() {
	return profile;
}
public void setProfile(String profile) {
	this.profile = profile;
}

}
