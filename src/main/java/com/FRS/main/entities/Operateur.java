package com.FRS.main.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Operateur implements Serializable{
	@Id @GeneratedValue(strategy= GenerationType.AUTO)
	private Long Id_Operateur;
	private String Nom;
	private String code;
	public Long getId_Operateur() {
		return Id_Operateur;
	}
	public void setId_Operateur(Long id_Operateur) {
		Id_Operateur = id_Operateur;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Operateur( String nom, String code) {
		super();
		
		Nom = nom;
		this.code = code;
	}
	public Operateur() {
		super();
		
	}
	
}
