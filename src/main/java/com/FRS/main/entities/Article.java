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
@Id	@GeneratedValue(strategy= GenerationType.AUTO)
	
	

	private long Id_Article;
	private String Serial_Number;
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
	private Date Date_récupération;
	private String commentaire;
	private String Code_Securite;
	public long getId_Article() {
		return Id_Article;
	}
	public void setId_Article(long id_Article) {
		Id_Article = id_Article;
	}
	public String getSerial_Number() {
		return Serial_Number;
	}
	public void setSerial_Number(String serial_Number) {
		Serial_Number = serial_Number;
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
	public Date getDate_récupération() {
		return Date_récupération;
	}
	public void setDate_récupération(Date date_récupération) {
		Date_récupération = date_récupération;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public String getCode_Securite() {
		return Code_Securite;
	}
	public void setCode_Securite(String code_Securite) {
		Code_Securite = code_Securite;
	}

	public Article( String serial_Number, String marque, String model, Boutique boutique,
			String operateur, Reparation reparation, Boolean livraison, Date date_récupération, String commentaire,
			String code_Securite) {
		super();
		
		Serial_Number = serial_Number;
		Marque = marque;
		Model = model;
		this.boutique = boutique;
		this.operateur = operateur;
		this.reparation = reparation;
		Livraison = livraison;
		Date_récupération = date_récupération;
		this.commentaire = commentaire;
		Code_Securite = code_Securite;
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
