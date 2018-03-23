package com.FRS.main.dao;

import com.FRS.main.entities.Article;
import com.FRS.main.entities.Bon_Reparation;
import com.FRS.main.entities.Client;
import com.FRS.main.entities.Demande_Reparation;
import com.FRS.main.entities.Encaissement;
import com.FRS.main.entities.Tache_Reparation;

public class ResponceWrapper {
Demande_Reparation DR;
Client client;
Encaissement Enc;
Article article;
Bon_Reparation BonRep;
Tache_Reparation tacheRep;
public ResponceWrapper() {
	super();
	// TODO Auto-generated constructor stub
}
public ResponceWrapper( Demande_Reparation dR, Client client, Encaissement enc, Article article,
		Bon_Reparation bonRep, Tache_Reparation tacheRep) {
	super();
	
	DR = dR;
	this.client = client;
	Enc = enc;
	this.article = article;
	BonRep = bonRep;
	this.tacheRep = tacheRep;
}

public Demande_Reparation getDR() {
	return DR;
}
public void setDR(Demande_Reparation dR) {
	DR = dR;
}
public Client getClient() {
	return client;
}
public void setClient(Client client) {
	this.client = client;
}
public Encaissement getEnc() {
	return Enc;
}
public void setEnc(Encaissement enc) {
	Enc = enc;
}
public Article getArticle() {
	return article;
}
public void setArticle(Article article) {
	this.article = article;
}
public Bon_Reparation getBonRep() {
	return BonRep;
}
public void setBonRep(Bon_Reparation bonRep) {
	BonRep = bonRep;
}
public Tache_Reparation getTacheRep() {
	return tacheRep;
}
public void setTacheRep(Tache_Reparation tacheRep) {
	this.tacheRep = tacheRep;
}

}
