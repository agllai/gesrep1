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
@DiscriminatorValue( value="demande_reparation" )
@PrimaryKeyJoinColumn(referencedColumnName="Rid")
public class Demande_Reparation extends Reparation {
	

	private Long DRid;
	private String Designation;
	private Type_Panne type_panne;

	
	public Demande_Reparation(Client client, Boutique boutique, Date date_heure, Personnel Createur,
			String designation, Type_Panne type_panne) {
		super(client, boutique, date_heure, Createur);
		Designation = designation;
		this.type_panne = type_panne;
	}
	public Long getDRid() {
		return DRid;
	}
	public void setDRid(Long dRid) {
		DRid = dRid;
	}
	public Demande_Reparation() {
		super();
		
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public Type_Panne getType_panne() {
		return type_panne;
	}
	public void setType_panne(Type_Panne type_panne) {
		this.type_panne = type_panne;
	}

}
