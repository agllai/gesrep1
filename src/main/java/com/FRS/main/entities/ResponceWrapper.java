/**
 * 
 */
package com.FRS.main.entities;

import java.util.List;

import org.springframework.data.repository.NoRepositoryBean;
@NoRepositoryBean
public class ResponceWrapper {
	public Demande_Reparation DR;
	public Client client;
//	public Encaissement Enc;
	public Article article;
//	public Bon_Reparation BonRep;
//	public List<Tache_Reparation> tacheRep;
	public ResponceWrapper() {
		super();
	}

//	public Demande_Reparation getDR() {
//		return DR;
//	}
//
//	public void setDR(Demande_Reparation dR) {
//		DR = dR;
//	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

//	public Encaissement getEnc() {
//		return Enc;
//	}
//
//	public void setEnc(Encaissement enc) {
//		Enc = enc;
//	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

//	public Bon_Reparation getBonRep() {
//		return BonRep;
//	}
//
//	public void setBonRep(Bon_Reparation bonRep) {
//		BonRep = bonRep;
//	}
//
//	public List<Tache_Reparation> getTacheRep() {
//		return tacheRep;
//	}

//	public void setTacheRep(List<Tache_Reparation> tacheRep) {
//		this.tacheRep = tacheRep;
//	}

	public ResponceWrapper( Demande_Reparation dR, Client client, Article article) {
		super();
		
		this.DR = dR;
		this.client = client;
//		this.Enc = enc;
		this.article = article;
//		this.BonRep = bonRep;
//		this.tacheRep = tacheRep;
	}
}
