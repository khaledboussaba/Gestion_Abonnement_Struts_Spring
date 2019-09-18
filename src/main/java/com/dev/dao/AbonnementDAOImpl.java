package com.dev.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.dev.entities.Abonnement;

public class AbonnementDAOImpl implements IAbonnementDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void addAbonnement(Abonnement abonnement) {
		em.persist(abonnement);
	}

	@Override
	public List<Abonnement> listeAbonnements(boolean actif) {
		Query query = em.createQuery("SELECT a FROM Abonnement a WHERE a.actif = :x ");
		query.setParameter("x", actif);
		return query.getResultList();
	}

	@Override
	public List<Abonnement> listeAbonnements(Date d1, Date d2) {
		Query query = em.createQuery("SELECT a FROM Abonnement a WHERE a.dateAbonnement BETWEEN :x AND :y ");
		query.setParameter("x", d1);
		query.setParameter("x", d2);
		return query.getResultList();
	}

	@Override
	public Abonnement getAbonnement(Long idAbonnement) {
		return em.find(Abonnement.class, idAbonnement);
	}

	@Override
	public void deleteAbonnement(Long idAbonnement) {
		Abonnement abonnement = getAbonnement(idAbonnement);
		em.remove(abonnement);
	}

	@Override
	public void updateAbonnement(Abonnement abonnement) {
		em.merge(abonnement);
	}

	@Override
	public void consomer(Long idAbonnement, double montant) {
		Abonnement abonnement = getAbonnement(idAbonnement);
		abonnement.setSolde(abonnement.getSolde() - montant);
	}

}
