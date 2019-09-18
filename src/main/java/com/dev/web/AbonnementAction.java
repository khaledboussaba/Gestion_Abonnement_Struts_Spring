package com.dev.web;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dev.entities.Abonnement;
import com.dev.entities.AbonnementGSM;
import com.dev.entities.AbonnementInternet;
import com.dev.service.IAbonnementService;
import com.opensymphony.xwork2.ActionSupport;

@Component
public class AbonnementAction extends ActionSupport {
	
	@Autowired
	private IAbonnementService service;
	private Long idAbonnement;
	private Date dateAbonnement;
	private double solde;
	private boolean actif;
	private int fideleo;
	private int debit;
	private String type;
	private String[] typesAbonnement = new String[]{"", "GSM", "INT"};
	private List<Abonnement> abonnements;
	
	public String index() {
		abonnements = service.listeAbonnements(true);
		return SUCCESS;
	}
	
	public String getSubForm() {
		return SUCCESS;
	}
	
	public String save() {
		Abonnement abonnement;
		if (type.equals("GSM"))
			abonnement = new AbonnementGSM(dateAbonnement, solde, actif, fideleo);
		else
			abonnement = new AbonnementInternet(dateAbonnement, solde, actif, debit);
		service.addAbonnement(abonnement);
		abonnements = service.listeAbonnements(true);
		return SUCCESS;
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

	public int getFideleo() {
		return fideleo;
	}

	public void setFideleo(int fideleo) {
		this.fideleo = fideleo;
	}

	public int getDebit() {
		return debit;
	}

	public void setDebit(int debit) {
		this.debit = debit;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String[] getTypesAbonnement() {
		return typesAbonnement;
	}

	public void setTypesAbonnement(String[] typesAbonnement) {
		this.typesAbonnement = typesAbonnement;
	}

	public List<Abonnement> getAbonnements() {
		return abonnements;
	}

	public void setAbonnements(List<Abonnement> abonnements) {
		this.abonnements = abonnements;
	}

}
