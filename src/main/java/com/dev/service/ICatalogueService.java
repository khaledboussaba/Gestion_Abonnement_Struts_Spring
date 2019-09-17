package com.dev.service;

import java.util.List;

import com.dev.entities.Produit;

public interface ICatalogueService {
	public void addProduit(Produit produit);
	public List<Produit> listeProduits();
	public Produit getProduit(String reference);
	public void deleteProduit(String reference);
	public void updateProduit(Produit produit);
}
