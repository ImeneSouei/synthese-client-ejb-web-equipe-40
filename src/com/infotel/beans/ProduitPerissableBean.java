package com.infotel.beans;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.infotel.ejb.IProduitRemote;
import com.infotel.metier.ProduitNonPerissable;
import com.infotel.metier.ProduitPerissable;
@Named
@SessionScoped
public class ProduitPerissableBean implements Serializable{
	@EJB
	private IProduitRemote service;

	public IProduitRemote getService() {
		return service;
	}

	public void setService (IProduitRemote service) {
		this.service = service;
	}
	private ProduitPerissable produitperissable= new ProduitPerissable();

	public ProduitPerissable getProduitperissable() {
		return produitperissable;
	}

	public void setProduitperissable(ProduitPerissable produitperissable) {
		this.produitperissable = produitperissable;
	}
	// Méthodes
	
	
				public void ajouterProduitPerissable() {
					service.ajouterProduitPerissable(produitperissable);
					produitperissable = new ProduitPerissable();
				}
				public List<ProduitNonPerissable>  findAllProduitNonPerissable(){
					return service. findAllProduitNonPerissable();
				}
				public void modifierProduitPerissable() {
					service.modifierProduitPerissable(produitperissable);
					produitperissable = new ProduitPerissable();
				}
				public void supprimerProduitPerissable(long idProduit) {
					service.supprimerProduitNonPerissable(idProduit);
				}
				public ProduitPerissable getProduitPerissable(long idProduit) {
					return service.getProduitPerissable(idProduit);
				}
				public ProduitPerissable affichageProduitPerissable(long idProduit) {
					return service.affichageProduitPerissable(idProduit);
				}
				
	}



