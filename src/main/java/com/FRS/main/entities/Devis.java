package com.FRS.main.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@DiscriminatorValue( value="devis" )
@PrimaryKeyJoinColumn(referencedColumnName="Rid")
public class Devis extends Reparation {
	
private Long DEid;
private String Commentaire;

public Devis() {
	super();
	
}


public Devis( Client client, Boutique boutique, Date date_heure, int id_Créateur, double tarif, int dEid,
		String commentaire) {
	super(client, boutique, date_heure, id_Créateur, tarif);

	Commentaire = commentaire;
}


public String getCommentaire() {
	return Commentaire;
}

public void setCommentaire(String commentaire) {
	Commentaire = commentaire;
}


public Long getDEid() {
	return DEid;
}


public void setDEid(Long dEid) {
	DEid = dEid;
}


}
