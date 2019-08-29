package fr.fo.ud.data.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.fo.ud.data.api.IDaoUtilisateur;
import fr.fo.ud.entity.Utilisateur;

public class DaoUtilisateurImpl implements IDaoUtilisateur {

    @PersistenceContext(unitName = "Udgest_Entity")
    EntityManager em;
    
	public Utilisateur add(Utilisateur paramUser) {
		// TODO Auto-generated method stub
		return null;
	}

	public Utilisateur update(Utilisateur paramUser) {
		// TODO Auto-generated method stub
		return null;
	}

	public Utilisateur delete(Utilisateur paramUser) {
		// TODO Auto-generated method stub
		return null;
	}

	public Utilisateur getById(Integer paramId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Utilisateur connexion(String paramLogin, String paramMdp) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deconnexion() {
		// TODO Auto-generated method stub
		
	}


}
