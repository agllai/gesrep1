package com.FRS.main.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
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
	 @JoinColumn(name="IdArticle")
	 private Article article;
	private Date date_heure;
	@ManyToOne
	@JoinColumn(name="ID_Personnel"  ,nullable=true )
	
	private Personnel personnel;
	
	public Reparation( Client client, Boutique boutique, Date date_heure, Personnel personnel) {
		super();
		
		this.client = client;
		this.boutique = boutique;
		this.date_heure = date_heure;
		this.personnel = personnel;
		
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
	public Personnel getId_personnel() {
		return personnel;
	}
	public void setId_Créateur(Personnel Createur) {
		this.personnel = Createur;
	}
	
}
