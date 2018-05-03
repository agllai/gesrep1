package com.FRS.main.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Tache_Reparation implements Serializable{
	@Id @GeneratedValue(strategy= GenerationType.AUTO)
private Long Id_Tache_Réparation;
	 @ManyToOne
	 @JoinColumn(name="Id_Etat")
private Etat etat;
	 @OneToOne
	 @JoinColumn(name="IdArticle")
private Article article;
	 @ManyToOne
	 @JoinColumn(name="DRid")

private Demande_Reparation demande_reparation;
	 @OneToMany
	 private List<Personnel> Reparateur;
	 	@OneToOne
		 @JoinColumn(name="ID_Personnel")
	 private Personnel Createur;
private String Panne;
@OneToOne
@JoinColumn(name="Id_Composant")
private Composant composant;
private String Description;
@ManyToOne
@JoinColumn(name="Id_Encaissement")

private Encaissement Enc;

public Encaissement getEnc() {
	return Enc;
}
public void setEnc(Encaissement enc) {
	Enc = enc;
}
public Tache_Reparation( Etat etat, Article article, Demande_Reparation demande_reparation,
		List<Personnel> reparateur, Personnel createur, String panne, Composant composant, String description) {
	super();

	this.etat = etat;
	this.article = article;
	this.demande_reparation = demande_reparation;
	Reparateur = reparateur;
	Createur = createur;
	Panne = panne;
	this.composant = composant;
	Description = description;
}
public Tache_Reparation() {
	super();
	
}
public Demande_Reparation getDemande_reparation() {
	return demande_reparation;
}
public void setDemande_reparation(Demande_Reparation demande_reparation) {
	this.demande_reparation = demande_reparation;
}
public List<Personnel> getReparateur() {
	return Reparateur;
}
public void setReparateur(List<Personnel> reparateur) {
	Reparateur = reparateur;
}
public Personnel getCreateur() {
	return Createur;
}
public void setCreateur(Personnel createur) {
	Createur = createur;
}
public Long getId_Tache_Réparation() {
	return Id_Tache_Réparation;
}
public void setId_Tache_Réparation(Long id_Tache_Réparation) {
	Id_Tache_Réparation = id_Tache_Réparation;
}
public Etat getEtat() {
	return etat;
}
public void setEtat(Etat etat) {
	this.etat = etat;
}
public Article getArticle() {
	return article;
}
public void setArticle(Article article) {
	this.article = article;
}

public String getPanne() {
	return Panne;
}
public void setPanne(String panne) {
	Panne = panne;
}
public Composant getComposant() {
	return composant;
}
public void setComposant(Composant composant) {
	this.composant = composant;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}


	
}
