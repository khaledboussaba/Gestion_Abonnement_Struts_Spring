package com.dev.service;

import java.util.List;

import com.dev.dao.ICatalogueDAO;
import com.dev.entities.Produit;

public class CatalogueServiceImpl implements ICatalogueService {

	private ICatalogueDAO dao;	
	public void setDao(ICatalogueDAO dao) {
		this.dao = dao;
	}

	@Override
	public void addProduit(Produit produit) {
		dao.addProduit(produit);
	}

	@Override
	public List<Produit> listeProduits() {
		return dao.listeProduits();
	}

	@Override
	public Produit getProduit(String reference) {
		return dao.getProduit(reference);
	}

	@Override
	public void deleteProduit(String reference) {
		dao.deleteProduit(reference);
	}

	@Override
	public void updateProduit(Produit produit) {
		dao.updateProduit(produit);
	}

}
