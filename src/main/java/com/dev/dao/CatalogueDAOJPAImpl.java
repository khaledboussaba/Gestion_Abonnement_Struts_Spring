package com.dev.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.dev.entities.Produit;

public class CatalogueDAOJPAImpl implements ICatalogueDAO {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void addProduit(Produit produit) {
		em.persist(produit);
	}

	@Override
	public List<Produit> listeProduits() {
		Query query = em.createQuery("SELECT p FROM Produit p");
		return query.getResultList();
	}

	@Override
	public Produit getProduit(String reference) {
		return em.find(Produit.class, reference);
	}

	@Override
	public void deleteProduit(String reference) {
		Produit p = getProduit(reference);
		em.remove(p);
	}

	@Override
	public void updateProduit(Produit produit) {
		em.merge(produit);
	}

}
