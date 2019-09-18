package com.dev.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_AB", length = 3)
public abstract class Abonnement implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAbonnement;
	private Date dateAbonnement;
	private double solde;
	private boolean actif;
	
	
	public Abonnement() {
	}
	
	public Abonnement(Date dateAbonnement, double solde, boolean actif) {
		this.dateAbonnement = dateAbonnement;
		this.solde = solde;
		this.actif = actif;
	}


	public Long getIdAbonnement() {
		return idAbonnement;
	}
	public void setIdAbonnement(Long idAbonnement) {
		this.idAbonnement = idAbonnement;
	}
	public Date getDateAbonnement() {
		return dateAbonnement;
	}
	public void setDateAbonnement(Date dateAbonnement) {
		this.dateAbonnement = dateAbonnement;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public boolean isActif() {
		return actif;
	}
	public void setActif(boolean actif) {
		this.actif = actif;
	}

}
