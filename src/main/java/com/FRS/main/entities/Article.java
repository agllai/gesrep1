package com.FRS.main.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.OneToOne;

@Entity
public class Article implements Serializable{
@Id	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long IdArticle;
	private String SerialNumber;
	private String Marque;
	private String Model;
	@ManyToOne
	@JoinColumn(name="id_boutique")
	private Boutique boutique;

	//	@ManyToOne
//	@JoinColumn(name="id_operateur")
	private String operateur;
	@OneToOne
	@JoinColumn(name="Rid")
	private Reparation reparation;
	private Boolean Livraison;
	private Date DateRécupération;
	private String commentaire;
	private String CodeSecurite;
	public Article(long idArticle, String serialNumber, String marque, String model, Boutique boutique,
			String operateur, Reparation reparation, Boolean livraison, Date dateRécupération, String commentaire,
			String codeSecurite) {
		super();
		IdArticle = idArticle;
		SerialNumber = serialNumber;
		Marque = marque;
		Model = model;
		this.boutique = boutique;
		this.operateur = operateur;
		this.reparation = reparation;
		Livraison = livraison;
		DateRécupération = dateRécupération;
		this.commentaire = commentaire;
		CodeSecurite = codeSecurite;
	}
public String getCodeSecurite() {
		return CodeSecurite;
	}
	public void setCodeSecurite(String codeSecurite) {
		CodeSecurite = codeSecurite;
	}
	public void setSerialNumber(String serialNumber) {
		SerialNumber = serialNumber;
	}
	public void setDateRécupération(Date dateRécupération) {
		DateRécupération = dateRécupération;
	}
	public long getIdArticle() {
		return IdArticle;
	}
	public void setIdArticle(long idArticle) {
		IdArticle = idArticle;
	}
	public String getSerialNumber() {
		return SerialNumber;
	}
	public void setSerial_Number(String serialNumber) {
		SerialNumber = serialNumber;
	}
	public String getMarque() {
		return Marque;
	}
	public void setMarque(String marque) {
		Marque = marque;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public Boutique getBoutique() {
		return boutique;
	}
	public void setBoutique(Boutique boutique) {
		this.boutique = boutique;
	}
	public String getOperateur() {
		return operateur;
	}
	public void setOperateur(String operateur) {
		this.operateur = operateur;
	}

	public Boolean getLivraison() {
		return Livraison;
	}
	public void setLivraison(Boolean livraison) {
		Livraison = livraison;
	}
	public Date getDateRécupération() {
		return DateRécupération;
	}
	public void setDate_récupération(Date dateRécupération) {
		DateRécupération = dateRécupération;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Reparation getReparation() {
		return reparation;
	}
	public void setReparation(Reparation reparation) {
		this.reparation = reparation;
	}
	public Article() {
		super();
		
	}
	
}
