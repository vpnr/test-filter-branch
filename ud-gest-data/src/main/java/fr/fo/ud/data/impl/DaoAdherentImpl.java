package fr.fo.ud.data.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import fr.fo.ud.data.api.IDaoAdherent;
import fr.fo.ud.entity.Adherent;
import fr.fo.ud.entity.Entreprise;
import fr.fo.ud.entity.Fonction;
import fr.fo.ud.entity.Formation;
import fr.fo.ud.entity.Syndicat;

@Component
public class DaoAdherentImpl implements IDaoAdherent {

	@PersistenceContext
	private EntityManager em;
	
    public Adherent add(Adherent paramAdh) {
       em.persist(paramAdh);
       return paramAdh; 
    }

	public Adherent update(Adherent paramAdh) {
		Adherent adh = null;
		return null;
	}

	public Adherent delete(Adherent paramAdh) {
		em.remove(paramAdh);
		return paramAdh;
	}

	public List<Adherent> findByNom(String paramNom) {
		List<Adherent> adherents = null;
		Query q = em.createQuery("select a from Adherent a where nom =:pNom");
		q.setParameter("pNom", paramNom);
		adherents = q.getResultList();
		return adherents;
	}

	public List<Adherent> findByMotCle(String paramMotCle) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Adherent> findByVille(String paramVille) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Adherent> findByCodePostal(String paramCodePostal) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Adherent> findByEntreprise(Entreprise paramEntreprise) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Adherent> findBySyndicat(Syndicat paramSyndicat) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Adherent> findByFormation(Formation paramFormation) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Adherent> findByFonction(Fonction paramFonction) {
		// TODO Auto-generated method stub
		return null;
	}

	public Adherent findById(Integer paramId) {
		return em.createQuery("select a from Adherent a where id =:pId", Adherent.class).setParameter("pId", paramId).getSingleResult();
	}

}
