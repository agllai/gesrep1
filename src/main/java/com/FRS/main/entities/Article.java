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
	private long idArticle;
	private String serialNumber;
	private String marque;
	private String model;
	@ManyToOne
	@JoinColumn(name="id_boutique")
	private Boutique boutique;

	//	@ManyToOne
//	@JoinColumn(name="id_operateur")
	private String operateur;
	@OneToOne
	@JoinColumn(name="Rid")
	private Reparation reparation;
	private Boolean livraison;
	private Date dateRécupération;
	private String commentaire;
	private String CodeSecurite;
	
/**
	 * @param idArticle
	 * @param serialNumber
	 * @param marque
	 * @param model
	 * @param boutique
	 * @param operateur
	 * @param reparation
	 * @param livraison
	 * @param dateRécupération
	 * @param commentaire
	 * @param codeSecurite
	 */
	public Article(long idArticle, String serialNumber, String marque, String model, Boutique boutique,
			String operateur, Reparation reparation, Boolean livraison, Date dateRécupération, String commentaire,
			String codeSecurite) {
		super();
		this.idArticle = idArticle;
		this.serialNumber = serialNumber;
		this.marque = marque;
		this.model = model;
		this.boutique = boutique;
		this.operateur = operateur;
		this.reparation = reparation;
		this.livraison = livraison;
		this.dateRécupération = dateRécupération;
		this.commentaire = commentaire;
		this.CodeSecurite = codeSecurite;
	}
	
/**
 * @return the idArticle
 */
public long getIdArticle() {
	return idArticle;
}

/**
 * @param idArticle the idArticle to set
 */
public void setIdArticle(long idArticle) {
	this.idArticle = idArticle;
}

/**
 * @return the serialNumber
 */
public String getSerialNumber() {
	return serialNumber;
}

/**
 * @param serialNumber the serialNumber to set
 */
public void setSerialNumber(String serialNumber) {
	this.serialNumber = serialNumber;
}

/**
 * @return the marque
 */
public String getMarque() {
	return marque;
}

/**
 * @param marque the marque to set
 */
public void setMarque(String marque) {
	this.marque = marque;
}

/**
 * @return the model
 */
public String getModel() {
	return model;
}

/**
 * @param model the model to set
 */
public void setModel(String model) {
	this.model = model;
}

/**
 * @return the livraison
 */
public Boolean getLivraison() {
	return livraison;
}

/**
 * @param livraison the livraison to set
 */
public void setLivraison(Boolean livraison) {
	this.livraison = livraison;
}

/**
 * @return the dateRécupération
 */
public Date getDateRécupération() {
	return dateRécupération;
}

/**
 * @param dateRécupération the dateRécupération to set
 */
public void setDateRécupération(Date dateRécupération) {
	this.dateRécupération = dateRécupération;
}

public String getCodeSecurite() {
		return CodeSecurite;
	}
	public void setCodeSecurite(String codeSecurite) {
		CodeSecurite = codeSecurite;
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
