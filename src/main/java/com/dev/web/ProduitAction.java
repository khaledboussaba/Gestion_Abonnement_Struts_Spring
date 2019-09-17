package com.dev.web;

import java.util.List;

import com.dev.entities.Produit;
import com.dev.service.ICatalogueService;
import com.dev.service.SingletonService;
import com.opensymphony.xwork2.ActionSupport;

public class ProduitAction extends ActionSupport {
	
	private Produit produit = new Produit();
	
	private List<Produit> produits;
	private ICatalogueService service = SingletonService.getService();
	
	public String index() {
		produits = service.listeProduits();
		return SUCCESS; //constante par défaut héritée de ActionSupport et qui a la valeur "success"
	}

	public String save() {
		service.addProduit(produit);
		produits = service.listeProduits();
		return SUCCESS;
	}
	
	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

}
