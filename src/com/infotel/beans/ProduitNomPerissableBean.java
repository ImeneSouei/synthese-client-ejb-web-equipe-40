package com.infotel.beans;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.infotel.ejb.IProduitRemote;
import com.infotel.metier.ProduitNonPerissable;

@Named
@SessionScoped
public class ProduitNomPerissableBean implements Serializable {
	private static final long serialVersionUID = 1L;
	// Attributs
			@EJB
			private IProduitRemote service;
			public IProduitRemote getService() {
				return service;
			}
			public void  setService(IProduitRemote service) {
				this.service = service;
			}
			public static long getSerialversionuid() {
				return serialVersionUID;
			}
			private ProduitNonPerissable produitnomperissable= new ProduitNonPerissable();
			public ProduitNonPerissable getProduitnomperissable() {
				return produitnomperissable;
			}
			public void setProduitnomperissable(ProduitNonPerissable produitnomperissable) {
				this.produitnomperissable = produitnomperissable;
			}
			// Méthodes
			
			
			public void ajouterProduitNonPerissable() {
				service.ajouterProduitNonPerissable(produitnomperissable);
				produitnomperissable = new ProduitNonPerissable();
			}
			public List<ProduitNonPerissable>  findAllProduitNonPerissable(){
				return service. findAllProduitNonPerissable();
			}
			public void modifierProduitNonPerissable() {
				service.modifierProduitNonPerissable(produitnomperissable);
				produitnomperissable = new ProduitNonPerissable();
			}
			public void supprimerProduitNonPerissable(long idProduit) {
				service.supprimerProduitNonPerissable(idProduit);
			}
			public ProduitNonPerissable getProduitNonPerissable(long idProduit) {
				return service.getProduitNonPerissable(idProduit);
			}
			public ProduitNonPerissable affichageProduitNonPerissable(long idProduit) {
				return service.affichageProduitNonPerissable(idProduit);
			}
			
}
