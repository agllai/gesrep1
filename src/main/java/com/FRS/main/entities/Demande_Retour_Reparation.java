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
public class Demande_Retour_Reparation implements Serializable{
	@Id @GeneratedValue(strategy= GenerationType.AUTO)
	private Long DRRid;
    @ManyToOne
    @JoinColumn(name="DRid")
	private Demande_Reparation demande_réparation;
	private String panne;
	 @ManyToOne
	private Type_Panne type_panne;
	private String Designation;
	 @ManyToOne
	    @JoinColumn(name="id_creator")

	private Personnel Creator;
	private Date date_heure;
	  @ManyToOne
	    @JoinColumn(name="id_boutique")

	private Boutique boutique;
	public Demande_Retour_Reparation(Demande_Reparation demande_réparation, String panne, Type_Panne type_panne,
			String designation, Personnel creator, Date date_heure, Boutique boutique) {
		super();
		this.demande_réparation = demande_réparation;
		this.panne = panne;
		this.type_panne = type_panne;
		Designation = designation;
		Creator = creator;
		this.date_heure = date_heure;
		this.boutique = boutique;
	}
	public Demande_Retour_Reparation() {
		super();
		
	}
	
	public Long getDRRid() {
		return DRRid;
	}
	public void setDRRid(Long dRRid) {
		DRRid = dRRid;
	}
	public Demande_Reparation getDemande_réparation() {
		return demande_réparation;
	}
	public void setDemande_réparation(Demande_Reparation demande_réparation) {
		this.demande_réparation = demande_réparation;
	}
	public String getPanne() {
		return panne;
	}
	public void setPanne(String panne) {
		this.panne = panne;
	}
	public Type_Panne getType_panne() {
		return type_panne;
	}
	public void setType_panne(Type_Panne type_panne) {
		this.type_panne = type_panne;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public Personnel getCreator() {
		return Creator;
	}
	public void setCreator(Personnel creator) {
		this.Creator = creator;
	}
	public Date getDate_heure() {
		return date_heure;
	}
	public void setDate_heure(Date date_heure) {
		this.date_heure = date_heure;
	}
	public Boutique getBoutique() {
		return boutique;
	}
	public void setBoutique(Boutique boutique) {
		this.boutique = boutique;
	}
	
}
