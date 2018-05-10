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
	private Long IdEncaissement;
	 @ManyToOne
	 @JoinColumn(name="id_boutique")
	private Boutique Boutique;
	private double MontantAvance;
	private String MoyenPaiment;
	private long Reduction;
	private double MontantPaye;
	 @ManyToOne
	 @JoinColumn(name="Drid", referencedColumnName="DRid")
	 private Demande_Reparation demandeReparation;
	private double TotalHT;
	 @ManyToOne
	 @JoinColumn(name="idArticle")
	 private Article Article;
	
	private double TotalTTC;
	private int TVA;
	private double ResteAPaye;
	private double Tarif;
	@OneToMany
	@JoinColumn(name="Id_Tache_Réparation")
	@JsonIgnore
	private List<Tache_Reparation> tacheRep;
	
	
	
	/**
	 * @param idEncaissement
	 * @param boutique
	 * @param montantAvance
	 * @param moyenPaiment
	 * @param reduction
	 * @param montantPaye
	 * @param demandeReparation
	 * @param totalHT
	 * @param article
	 * @param totalTTC
	 * @param tVA
	 * @param resteAPaye
	 * @param tarif
	 * @param tacheRep
	 */
	public Encaissement(Long idEncaissement, com.FRS.main.entities.Boutique boutique, double montantAvance,
			String moyenPaiment, long reduction, double montantPaye, Demande_Reparation demandeReparation,
			double totalHT, com.FRS.main.entities.Article article, double totalTTC, int tVA, double resteAPaye,
			double tarif, List<Tache_Reparation> tacheRep) {
		super();
		IdEncaissement = idEncaissement;
		Boutique = boutique;
		MontantAvance = montantAvance;
		MoyenPaiment = moyenPaiment;
		Reduction = reduction;
		MontantPaye = montantPaye;
		this.demandeReparation = demandeReparation;
		TotalHT = totalHT;
		Article = article;
		TotalTTC = totalTTC;
		TVA = tVA;
		ResteAPaye = resteAPaye;
		Tarif = tarif;
		this.tacheRep = tacheRep;
	}
	/**
	 * @return the idEncaissement
	 */
	public Long getIdEncaissement() {
		return IdEncaissement;
	}
	/**
	 * @param idEncaissement the idEncaissement to set
	 */
	public void setIdEncaissement(Long idEncaissement) {
		IdEncaissement = idEncaissement;
	}
	/**
	 * @return the boutique
	 */
	public Boutique getBoutique() {
		return Boutique;
	}
	/**
	 * @param boutique the boutique to set
	 */
	public void setBoutique(Boutique boutique) {
		Boutique = boutique;
	}
	/**
	 * @return the totalHT
	 */
	public double getTotalHT() {
		return TotalHT;
	}
	/**
	 * @param totalHT the totalHT to set
	 */
	public void setTotalHT(double totalHT) {
		TotalHT = totalHT;
	}
	/**
	 * @return the article
	 */
	public Article getArticle() {
		return Article;
	}
	/**
	 * @param article the article to set
	 */
	public void setArticle(Article article) {
		Article = article;
	}
	/**
	 * @return the tarif
	 */
	public double getTarif() {
		return Tarif;
	}
	/**
	 * @param tarif the tarif to set
	 */
	public void setTarif(double tarif) {
		Tarif = tarif;
	}
	public double getMontantAvance() {
		return MontantAvance;
	}
	/**
	 * @param montantAvance the montantAvance to set
	 */
	public void setMontantAvance(double montantAvance) {
		MontantAvance = montantAvance;
	}
	/**
	 * @return the moyenPaiment
	 */
	public String getMoyenPaiment() {
		return MoyenPaiment;
	}
	/**
	 * @param moyenPaiment the moyenPaiment to set
	 */
	public void setMoyenPaiment(String moyenPaiment) {
		MoyenPaiment = moyenPaiment;
	}
	/**
	 * @return the reduction
	 */
	public long getReduction() {
		return Reduction;
	}
	/**
	 * @param reduction the reduction to set
	 */
	public void setReduction(long reduction) {
		Reduction = reduction;
	}
	/**
	 * @return the montantPaye
	 */
	public double getMontantPaye() {
		return MontantPaye;
	}
	/**
	 * @param montantPaye the montantPaye to set
	 */
	public void setMontantPaye(double montantPaye) {
		MontantPaye = montantPaye;
	}
	/**
	 * @return the demandeReparation
	 */
	public Demande_Reparation getDemandeReparation() {
		return demandeReparation;
	}
	/**
	 * @param demandeReparation the demandeReparation to set
	 */
	public void setDemandeReparation(Demande_Reparation demandeReparation) {
		this.demandeReparation = demandeReparation;
	}
	/**
	 * @return the total_HT
	 */
	
	/**
	 * @return the totalTTC
	 */
	public double getTotalTTC() {
		return TotalTTC;
	}
	/**
	 * @param totalTTC the totalTTC to set
	 */
	public void setTotalTTC(double totalTTC) {
		TotalTTC = totalTTC;
	}
	/**
	 * @return the resteAPaye
	 */
	public double getResteAPaye() {
		return ResteAPaye;
	}
	/**
	 * @param resteAPaye the resteAPaye to set
	 */
	public void setResteAPaye(double resteAPaye) {
		ResteAPaye = resteAPaye;
	}
	/**
	 * @param tacheRep the tacheRep to set
	 */
	public void setTacheRep(List<Tache_Reparation> tacheRep) {
		this.tacheRep = tacheRep;
	}
	public List<Tache_Reparation> getTacheRep() {
		return tacheRep;
	}
	public void addTacheRep(Tache_Reparation tacheRep) {
		this.tacheRep.add( tacheRep);	}
	
	
	public int getTVA() {
		return TVA;
	}
	public void setTVA(int tVA) {
		TVA = tVA;
	}
	
	
	

	
	public Encaissement() {
		super();
		
	}
	
}
