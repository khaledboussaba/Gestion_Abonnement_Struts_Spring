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
	private String ref;
	private boolean editMode = false;
	
	public String index() {
		produits = service.listeProduits();
		return SUCCESS; //constante par défaut héritée de ActionSupport et qui a la valeur "success"
	}

	public String save() {
		if (editMode == false) {
			service.addProduit(produit);	
			produit = new Produit();
		} else {
			service.updateProduit(produit);
			editMode = false;
			produit = new Produit();
		}
		produits = service.listeProduits();
		return SUCCESS;
	}
	
	public String delete() {
		service.deleteProduit(ref);
		produits = service.listeProduits();
		return SUCCESS;
	}
	
	public String edit() {
		editMode = true;
		produit = service.getProduit(ref);
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

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public boolean isEditMode() {
		return editMode;
	}

	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}

}
