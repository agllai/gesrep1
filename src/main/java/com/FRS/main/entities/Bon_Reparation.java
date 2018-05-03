package com.FRS.main.entities;

import java.util.List;
import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Bon_Reparation implements Serializable{
	@Id @GeneratedValue(strategy= GenerationType.AUTO)

private long Id_Bon_Réparation;
	@OneToOne
	@JoinColumn(name="Rid")
private Reparation réparation;
	
	@OneToOne
	@JoinColumn(name="idArticle")
private Article article;
	@ManyToOne
	@JoinColumn(name="id_type_panne")
private Type_Panne type_panne;
private Date Date_Récupération;
	@OneToOne
	@JoinColumn(name="id_client")
private Client client;
	@OneToMany
	@JoinColumn(name="Rid")
private List<Personnel> Réparateur;
	@OneToOne
	@JoinColumn(name="id_créateur")
private Personnel Créateur;
	public long getId_Bon_Réparation() {
		return Id_Bon_Réparation;
	}
	public void setId_Bon_Réparation(long id_Bon_Réparation) {
		Id_Bon_Réparation = id_Bon_Réparation;
	}
public Reparation getRéparation() {
	return réparation;
}
public void setRéparation(Reparation réparation) {
	this.réparation = réparation;
}
public Article getArticle() {
	return article;
}
public void setArticle(Article article) {
	this.article = article;
}
public Type_Panne getType_panne() {
	return type_panne;
}
public void setType_panne(Type_Panne type_panne) {
	this.type_panne = type_panne;
}
public Date getDate_Récupération() {
	return Date_Récupération;
}
public void setDate_Récupération(Date date_Récupération) {
	Date_Récupération = date_Récupération;
}
public Client getClient() {
	return client;
}
public void setClient(Client client) {
	this.client = client;
}
public List<Personnel> getRéparateur() {
	return Réparateur;
}
public void setRéparateur(List<Personnel> réparateur) {
	Réparateur = réparateur;
}
public Personnel getCréateur() {
	return Créateur;
}
public void setCréateur(Personnel créateur) {
	Créateur = créateur;
}
public Bon_Reparation(Reparation réparation, Article article, Type_Panne type_panne, Date date_Récupération,
		Client client, List<Personnel> réparateur, Personnel créateur) {
	super();
	this.réparation = réparation;
	this.article = article;
	this.type_panne = type_panne;
	Date_Récupération = date_Récupération;
	this.client = client;
	Réparateur = réparateur;
	Créateur = créateur;
}
public Bon_Reparation() {
	super();
	
}

}
