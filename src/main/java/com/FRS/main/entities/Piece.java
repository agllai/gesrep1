package com.FRS.main.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Piece implements Serializable{
	@Id @GeneratedValue(strategy= GenerationType.AUTO)
	

	private Long Id_Piece;
	private String Model ;
	private String Marque;
	private Double tarif;
	private String Type_Matriel;
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getMarque() {
		return Marque;
	}
	public Long getId_Piece() {
		return Id_Piece;
	}
	public void setId_Piece(Long id_Piece) {
		Id_Piece = id_Piece;
	}
	public void setMarque(String marque) {
		Marque = marque;
	}
	public Double getTarif() {
		return tarif;
	}
	public void setTarif(Double tarif) {
		this.tarif = tarif;
	}
	public String getType_Matriel() {
		return Type_Matriel;
	}
	public void setType_Matriel(String type_Matriel) {
		Type_Matriel = type_Matriel;
	}
	public Piece( String model, String marque, Double tarif, String type_Matriel) {
		super();
	
		Model = model;
		Marque = marque;
		this.tarif = tarif;
		Type_Matriel = type_Matriel;
	}
	public Piece() {
		super();
		
	}
	
}
