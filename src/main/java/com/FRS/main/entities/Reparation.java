package com.FRS.main.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Inheritance( strategy = InheritanceType.JOINED  )
@DiscriminatorColumn( name = "type" )
public abstract class Reparation implements Serializable{
	@Id @GeneratedValue(strategy= GenerationType.AUTO)

private Long Rid;
	 @ManyToOne
	 @JoinColumn(name="Id_Client")
	private Client client;
	 @ManyToOne
	 @JoinColumn(name="Id_boutique")
	private Boutique boutique;
	@OneToOne
	 @JoinColumn(name="Id_Article")
	 private Article article;
	private Date date_heure;
	private int id_Créateur;
	private double tarif;
	public Reparation( Client client, Boutique boutique, Date date_heure, int id_Créateur, double tarif) {
		super();
		
		this.client = client;
		this.boutique = boutique;
		this.date_heure = date_heure;
		this.id_Créateur = id_Créateur;
		this.tarif = tarif;
	}
	public Reparation() {
		super();
		
	}
	public Long getRid() {
		return Rid;
	}
	public void setRid(Long Rid) {
		this.Rid = Rid;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public double getTarif() {
		return tarif;
	}
	public void setTarif(double tarif) {
		this.tarif = tarif;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Boutique getBoutique() {
		return boutique;
	}
	public void setBoutique(Boutique boutique) {
		this.boutique = boutique;
	}
	public Date getDate_heure() {
		return date_heure;
	}
	public void setDate_heure(Date date_heure) {
		this.date_heure = date_heure;
	}
	public int getId_Créateur() {
		return id_Créateur;
	}
	public void setId_Créateur(int id_Créateur) {
		this.id_Créateur = id_Créateur;
	}
	
}
