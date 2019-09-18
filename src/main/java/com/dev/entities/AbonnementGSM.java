package com.dev.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="GSM")
public class AbonnementGSM extends Abonnement {
	private static final long serialVersionUID = 1L;
	
	private int fideleo;

	
	public AbonnementGSM() {
		super();
	}

	public AbonnementGSM(Date dateAbonnement, double solde, boolean actif, int fideleo) {
		super(dateAbonnement, solde, actif);
		this.fideleo = fideleo;
	}

	public int getFideleo() {
		return fideleo;
	}

	public void setFideleo(int fideleo) {
		this.fideleo = fideleo;
	}

}
