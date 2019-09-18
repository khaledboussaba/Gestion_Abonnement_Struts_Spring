package com.dev.service;

import java.util.Date;
import java.util.List;

import com.dev.entities.Abonnement;

public interface IAbonnementService {
	public void addAbonnement(Abonnement abonnement);
	public List<Abonnement> listeAbonnements(boolean actif);
	public List<Abonnement> listeAbonnements(Date d1, Date d2);
	public Abonnement getAbonnement(Long idAbonnement);
	public void deleteAbonnement(Long idAbonnement);
	public void updateAbonnement(Abonnement abonnement);
	public void consomer(Long idAbonnement, double montant);
}
