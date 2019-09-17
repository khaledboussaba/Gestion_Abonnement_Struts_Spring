package com.dev.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dev.entities.Produit;

public class CatalogueDAOImpl implements ICatalogueDAO {

	private Map<String, Produit> produits = new HashMap<String, Produit>();
	
	@Override
	public void addProduit(Produit produit) {
		produits.put(produit.getReference(), produit);
	}

	@Override
	public List<Produit> listeProduits() {
		return new ArrayList<Produit>(produits.values());
	}

	@Override
	public Produit getProduit(String reference) {
		return produits.get(reference);
	}

	@Override
	public void deleteProduit(String reference) {
		produits.remove(reference);
	}

	@Override
	public void updateProduit(Produit produit) {
		produits.put(produit.getReference(), produit);
	}
	
	public void initialisation() {
		addProduit(new Produit("AAA", "Ordinateur", 199, 20, true));
		addProduit(new Produit("BBB", "Téléphone", 159, 30, false));
		addProduit(new Produit("CCC", "Imprimante", 99, 10, true));
		System.out.println("Initialisation des PRODUITS");
	}

}
