package com.FRS.main.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Composant implements Serializable{
	@Id @GeneratedValue(strategy= GenerationType.AUTO)
	private Long Id_Composant;
	@ManyToOne
	@JoinColumn(name="id_piece")
	private Piece piece;
	private String Nom_Composant;
	private Double tarif;
	private Double tarif_minimal;
	public Composant(Piece piece, String nom_Composant, Double tarif, Double tarif_minimal) {
		super();
		this.piece = piece;
		Nom_Composant = nom_Composant;
		this.tarif = tarif;
		this.tarif_minimal = tarif_minimal;
	}
	public Composant() {
		super();
		
	}
	public Long getId_Composant() {
		return Id_Composant;
	}
	public void setId_Composant(Long id_Composant) {
		Id_Composant = id_Composant;
	}
	public Piece getPiece() {
		return piece;
	}
	public void setPiece(Piece piece) {
		this.piece = piece;
	}
	public String getNom_Composant() {
		return Nom_Composant;
	}
	public void setNom_Composant(String nom_Composant) {
		Nom_Composant = nom_Composant;
	}
	public Double getTarif() {
		return tarif;
	}
	public void setTarif(Double tarif) {
		this.tarif = tarif;
	}
	public Double getTarif_minimal() {
		return tarif_minimal;
	}
	public void setTarif_minimal(Double tarif_minimal) {
		this.tarif_minimal = tarif_minimal;
	}
	
}
