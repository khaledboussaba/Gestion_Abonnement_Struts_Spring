package com.dev.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String reference;
	private String designation;
	private double prix;
	private int quantite;
	private boolean promo;
	
	public Produit() {
		
	}
	public Produit(String reference, String designation, double prix, int quantite, boolean promo) {
		super();
		this.reference = reference;
		this.designation = designation;
		this.prix = prix;
		this.quantite = quantite;
		this.promo = promo;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public boolean isPromo() {
		return promo;
	}
	public void setPromo(boolean promo) {
		this.promo = promo;
	}
	
}
