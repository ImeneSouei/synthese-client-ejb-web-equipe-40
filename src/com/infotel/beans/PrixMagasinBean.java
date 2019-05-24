package com.infotel.beans;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.infotel.ejb.IProduitRemote;
import com.infotel.metier.Magasin;
import com.infotel.metier.ProduitPerissable;
@Named
@SessionScoped
public class PrixMagasinBean implements Serializable {
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

	// Méthodes;
	public double calculPrixMagasin(Magasin m) {
		return service.calculPrixMagasin(m);
	}
}


