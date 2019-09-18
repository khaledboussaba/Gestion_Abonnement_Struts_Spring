package com.dev.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="INT")
public class AbonnementInternet extends Abonnement {
	private static final long serialVersionUID = 1L;
	
	private int debit;

	public AbonnementInternet(Date dateAbonnement, double solde, boolean actif, int debit) {
		super(dateAbonnement, solde, actif);
		this.debit = debit;
	}

	public AbonnementInternet() {
		super();
	}

	public int getDebit() {
		return debit;
	}

	public void setDebit(int debit) {
		this.debit = debit;
	}
	
}
