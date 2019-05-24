package com.infotel.beans;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.infotel.ejb.IProduitRemote;
import com.infotel.metier.Magasin;
import com.infotel.metier.Produit;
import com.infotel.metier.ProduitPerissable;
@Named
@SessionScoped
public class SuppressionmagasinBean implements Serializable {
	@EJB
	private IProduitRemote service;

	public IProduitRemote getService() {
		return service;
	}

	public void setService(IProduitRemote service) {
		this.service = service;
	}
	private Magasin magasin= new Magasin();
	private ProduitPerissable produitperissable = new ProduitPerissable();


	
public Magasin getMagasin() {
		return magasin;
	}

	public void setMagasin(Magasin magasin) {
		this.magasin = magasin;
	}

	public ProduitPerissable getProduitperissable() {
		return produitperissable;
	}

	public void setProduitperissable(ProduitPerissable produitperissable) {
		this.produitperissable = produitperissable;
	}

	// Méthodes;
	public void supprimerMagasin(Magasin m) {
		service.supprimerMagasin(m);
	}
	
			
	}






