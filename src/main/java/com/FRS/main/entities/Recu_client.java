package com.FRS.main.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Recu_client implements Serializable{
	@Id @GeneratedValue(strategy= GenerationType.AUTO)
private Long Id_Recus_Client;
	 @ManyToOne
	 @JoinColumn(name="Rid")
private Reparation reparation;
	 @ManyToOne
	 @JoinColumn(name="nom")
private Personnel Employer;
private Date Date_heure;
private String Commentaire;
public Long getId_Recus_Client() {
	return Id_Recus_Client;
}
public void setId_Recus_Client(Long id_Recus_Client) {
	Id_Recus_Client = id_Recus_Client;
}


public Date getDate_heure() {
	return Date_heure;
}
public void setDate_heure(Date date_heure) {
	Date_heure = date_heure;
}
public String getCommentaire() {
	return Commentaire;
}
public void setCommentaire(String commentaire) {
	Commentaire = commentaire;
}


public Personnel getEmployer() {
	return Employer;
}
public void setEmployer(Personnel employer) {
	Employer = employer;
}
public Reparation getReparation() {
	return reparation;
}
public void setReparation(Reparation reparation) {
	this.reparation = reparation;
}
public Recu_client() {
	super();
	
}
public Recu_client(Reparation reparation, Personnel employer, Date date_heure, String commentaire) {
	super();
	this.reparation = reparation;
	Employer = employer;
	Date_heure = date_heure;
	Commentaire = commentaire;
}

}
