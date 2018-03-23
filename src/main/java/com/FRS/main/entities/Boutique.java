package com.FRS.main.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Boutique implements Serializable{
@Id @GeneratedValue(strategy= GenerationType.AUTO)

private Long  Id_boutique;
private String Code;
private String Region;
private String Contact;
private String Adresse;
private String Adresse_Societe;
private String Mention_legale;
private String Nom_Societe;
public Long getId_boutique() {
	return Id_boutique;
}
public void setId_boutique(Long id_boutique) {
	Id_boutique = id_boutique;
}
public String getCode() {
	return Code;
}
public void setCode(String code) {
	Code = code;
}
public String getRegion() {
	return Region;
}
public void setRegion(String region) {
	Region = region;
}
public String getContact() {
	return Contact;
}
public void setContact(String contact) {
	Contact = contact;
}
public String getAdresse() {
	return Adresse;
}
public void setAdresse(String adresse) {
	Adresse = adresse;
}
public String getAdresse_Societe() {
	return Adresse_Societe;
}
public void setAdresse_Societe(String adresse_Societe) {
	Adresse_Societe = adresse_Societe;
}
public String getMention_legale() {
	return Mention_legale;
}
public void setMention_legale(String mention_legale) {
	Mention_legale = mention_legale;
}
public String getNom_Societe() {
	return Nom_Societe;
}
public void setNom_Societe(String nom_Societe) {
	Nom_Societe = nom_Societe;
}
public Boutique(Long id_boutique, String code, String region, String contact, String adresse, String adresse_Societe,
		String mention_legale, String nom_Societe) {
	super();
	Id_boutique = id_boutique;
	Code = code;
	Region = region;
	Contact = contact;
	Adresse = adresse;
	Adresse_Societe = adresse_Societe;
	Mention_legale = mention_legale;
	Nom_Societe = nom_Societe;
}
public Boutique() {
	super();
	
}

}
