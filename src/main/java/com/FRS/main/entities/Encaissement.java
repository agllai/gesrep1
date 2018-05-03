package com.FRS.main.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import net.minidev.json.annotate.JsonIgnore;
@Entity
public class Encaissement implements Serializable{
	@Id @GeneratedValue(strategy= GenerationType.AUTO)
	private Long Id_Encaissement;
	 @ManyToOne
	 @JoinColumn(name="id_boutique")
	private Boutique boutique;
	private double Montant_avance;
	private String Moyen_paiment;
	private long Réduction;
	private double Montant_paye;
	 @ManyToOne
	 @JoinColumn(name="Drid", referencedColumnName="DRid")
	 private Demande_Reparation demande_reparation;
	private double Total_HT;
	 @ManyToOne
	 @JoinColumn(name="idArticle")
	 private Article article;
	
	private double Total_TTC;
	private int TVA;
	private double Reste_a_Paye;
	private double tarif;
	@OneToMany
	@JoinColumn(name="Id_Tache_Réparation")
	@JsonIgnore
	private List<Tache_Reparation> tacheRep;
	public Long getId_Encaissement() {
		return Id_Encaissement;
	}
	public void setId_Encaissement(Long id_Encaissement) {
		Id_Encaissement = id_Encaissement;
	}
	public List<Tache_Reparation> getTacheRep() {
		return tacheRep;
	}
	public void addTacheRep(Tache_Reparation tacheRep) {
		this.tacheRep.add( tacheRep);	}
	
	public Boutique getBoutique() {
		return boutique;
	}
	public void setBoutique(Boutique boutique) {
		this.boutique = boutique;
	}
	public Double getMontant_avance() {
		return Montant_avance;
	}
	public void setMontant_avance(Double montant_avance) {
		Montant_avance = montant_avance;
	}
	public String getMoyen_paiment() {
		return Moyen_paiment;
	}
	public void setMoyen_paiment(String moyen_paiment) {
		Moyen_paiment = moyen_paiment;
	}
	public Long getRéduction() {
		return Réduction;
	}
	public void setRéduction(Long réduction) {
		Réduction = réduction;
	}
	
	public Double getMontant_paye() {
		return Montant_paye;
	}
	public void setMontant_paye(Double montant_paye) {
		Montant_paye = montant_paye;
	}

	public Demande_Reparation getDemande_reparation() {
		return demande_reparation;
	}
	public void setDemande_reparation(Demande_Reparation demande_reparation) {
		this.demande_reparation = demande_reparation;
	}
	public void setMontant_avance(double montant_avance) {
		Montant_avance = montant_avance;
	}
	public void setRéduction(long réduction) {
		Réduction = réduction;
	}
	public void setMontant_paye(double montant_paye) {
		Montant_paye = montant_paye;
	}
	public void setTotal_HT(double total_HT) {
		Total_HT = total_HT;
	}
	public Double getTotal_HT() {
		return Total_HT;
	}
	public void setTotal_HT(Double total_HT) {
		Total_HT = total_HT;
	}
	
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public double getTotal_TTC() {
		return Total_TTC;
	}
	public void setTotal_TTC(double total_TTC) {
		Total_TTC = total_TTC;
	}
	public int getTVA() {
		return TVA;
	}
	public void setTVA(int tVA) {
		TVA = tVA;
	}
	public double getReste_a_Paye() {
		return Reste_a_Paye;
	}
	public void setReste_a_Paye(double reste_a_Paye) {
		Reste_a_Paye = reste_a_Paye;
	}
	public double getTarif() {
		return tarif;
	}
	public void setTarif(double tarif) {
		this.tarif = tarif;
	}
	

	public Encaissement( Boutique boutique, double montant_avance, String moyen_paiment,
			long réduction, double montant_paye, Demande_Reparation demande_reparation, double total_HT,
			Article article, double total_TTC, int tVA, double reste_a_Paye) {
		super();
		
		this.boutique = boutique;
		Montant_avance = montant_avance;
		Moyen_paiment = moyen_paiment;
		Réduction = réduction;
		Montant_paye = montant_paye;
		this.demande_reparation = demande_reparation;
		Total_HT = total_HT;
		this.article = article;
		Total_TTC = total_TTC;
		TVA = tVA;
		Reste_a_Paye = reste_a_Paye;
		
	}
	public Encaissement() {
		super();
		
	}
	
}
