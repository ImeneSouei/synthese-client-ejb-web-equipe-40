package com.infotel.beans;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.Query;

import com.infotel.ejb.IProduitRemote;
import com.infotel.metier.Produit;
import com.infotel.metier.ProduitNonPerissable;
import com.infotel.metier.ProduitPerissable;


@Named
@SessionScoped
public class AjoutProduitBean implements Serializable{
	@EJB
	private IProduitRemote  service;

	public IProduitRemote getService() {
		return service;
	}

	public void setService(IProduitRemote service) {
		this.service = service;
	}
	private ProduitPerissable ajoutproduit= new ProduitPerissable();

	public ProduitPerissable getAjoutproduit() {
return ajoutproduit;
}

public void setAjoutproduit(ProduitPerissable ajoutproduit) {
this.ajoutproduit = ajoutproduit;
}

	// Méthodes
	
public void ajouterProduit(Produit p, long idMagasin) {
service.ajouterProduit(p, idMagasin);
	
}
			
	}



