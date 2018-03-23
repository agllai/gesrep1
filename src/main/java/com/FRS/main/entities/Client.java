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


private Long Id_Client;
private String type_client;
private String nom;
private String adresse;
private String mail;
@Column(length=13)
private String Num_tel;

public Long getId_Client() {
	return Id_Client;
}
public void setId_Client(Long id_Client) {
	Id_Client = id_Client;
}
public String getType_client() {
	return type_client;
}
public void setType_client(String type_client) {
	this.type_client = type_client;
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
	adresse = adresse;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public String getNum_tel() {
	return Num_tel;
}
public void setNum_tel(String num_tel) {
	Num_tel = num_tel;
}

public Client(String type_client, String nom, String adresse, String mail, String num_tel, String id_boutique) {
	super();
	this.type_client = type_client;
	this.nom = nom;
	this.adresse = adresse;
	this.mail = mail;
	Num_tel = num_tel;
	
}
public Client() {
	super();
	
}

}