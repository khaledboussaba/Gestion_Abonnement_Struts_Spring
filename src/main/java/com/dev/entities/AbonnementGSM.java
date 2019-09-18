package com.dev.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="GSM")
public class AbonnementGSM extends Abonnement {
	private static final long serialVersionUID = 1L;
	
	private int fidelio;

	
	public AbonnementGSM() {
		super();
	}

	public AbonnementGSM(Date dateAbonnement, double solde, boolean actif, int fidelio) {
		super(dateAbonnement, solde, actif);
		this.fidelio = fidelio;
	}

	public int getFidelio() {
		return fidelio;
	}

	public void setFidelio(int fidelio) {
		this.fidelio = fidelio;
	}

}
