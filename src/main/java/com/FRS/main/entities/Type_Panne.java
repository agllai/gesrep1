package com.FRS.main.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Type_Panne implements Serializable{
	@Id @GeneratedValue(strategy= GenerationType.AUTO)


	private Long Id_Type_Panne;
	private String Designation;
	private String Code;
	private String Nom_Type_Panne;
	public Type_Panne(Long id_Type_Panne, String designation, String code, String nom_Type_Panne) {
		super();
		Id_Type_Panne = id_Type_Panne;
		Designation = designation;
		Code = code;
		Nom_Type_Panne = nom_Type_Panne;
	}
	public Type_Panne() {
		super();
	}
	public Long getId_Type_Panne() {
		return Id_Type_Panne;
	}
	public void setId_Type_Panne(Long id_Type_Panne) {
		Id_Type_Panne = id_Type_Panne;
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
	public String getNom_Type_Panne() {
		return Nom_Type_Panne;
	}
	public void setNom_Type_Panne(String nom_Type_Panne) {
		Nom_Type_Panne = nom_Type_Panne;
	}
	
}
