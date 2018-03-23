package com.FRS.main.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Etat implements Serializable{
	@Id @GeneratedValue(strategy= GenerationType.AUTO)
	

	private Long Id_Etat;
	private String Designation;
	private String Code;
	private String Nom;
	public Etat( String designation, String code, String nom) {
		super();
	
		Designation = designation;
		Code = code;
		Nom = nom;
	}
	public Etat() {
		super();
		
	}
	public Long getId_Etat() {
		return Id_Etat;
	}
	public void setId_Etat(Long id_Etat) {
		Id_Etat = id_Etat;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	
}
