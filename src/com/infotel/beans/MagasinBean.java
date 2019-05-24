package com.infotel.beans;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.infotel.ejb.IProduitRemote;
import com.infotel.metier.Magasin;
import com.infotel.metier.ProduitNonPerissable;
import com.infotel.metier.ProduitPerissable;
@Named
@SessionScoped
public class MagasinBean implements Serializable{
	@EJB
	private IProduitRemote service;

	public IProduitRemote getService() {
		return service;
	}

	public void setService(IProduitRemote service) {
		this.service = service;
	}
	private Magasin magasin= new Magasin();

	public Magasin getMagasin() {
		return magasin;
	}

	public void setMagasin(Magasin magasin) {
		this.magasin = magasin;
	}
	// Méthodes
				public void ajouterMagasin() {
					service.ajouterMagasin(magasin);
					
				}
				public List<Magasin>  findAllMagasins(){
					return service.findAllMagasins();
				}
				public void modifierMagasin() {
				service.modifierMagasin(magasin);
				
				}
				public void supprimerMagasin(long idMagasin) {
					service.supprimerMagasin(idMagasin);
				}
				public Magasin getMagasin(long idMagasin) {
					return service.getMagasin(idMagasin);
				}
				public Magasin affichageMagasin(long idMagasin) {
					return service.affichageMagasin(idMagasin);
				}
				
	}


