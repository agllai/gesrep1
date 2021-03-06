package com.FRS.main.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client implements Serializable{
@Id @GeneratedValue(strategy= GenerationType.AUTO)

@Column(name="idClient")
private Long IdClient=-1L;
private String typeClient;
private String nom;
private String adresse;
private String mail;
@Column(length=13)
private Long numtel;


public String getTypeClient() {
	return typeClient;
}
public void setTypeClient(String type_client) {
	this.typeClient = type_client;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public Long getNumtel() {
	return numtel;
}
public void setNum_tel(Long numtel) {
	this.numtel = numtel;
}
public long getIdClient() {
	return this.IdClient;
}

public void setIdClient(long IdClient) {
	// TODO Auto-generated method stub
	this.IdClient=IdClient;
}
public Client(Long IdClient,String type_client, String nom, String adresse, String mail, Long num_tel, String id_boutique) {
	super();
	this.IdClient=IdClient;
	this.typeClient = type_client;
	this.nom = nom;
	this.adresse = adresse;
	this.mail = mail;
	this.numtel = num_tel;
	
}
public Client() {
	super();
	
}
/**
 * @return
 */


}