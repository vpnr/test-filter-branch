package fr.fo.ud.data.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.fo.ud.data.api.IDaoVille;
import fr.fo.ud.entity.Ville;

public class DaoVilleImpl implements IDaoVille {

	@PersistenceContext(unitName = "Udgest_Entity")
	EntityManager em;
	
	public List<Ville> getAll() {
		List<Ville> villes = null;
		try {
			Query q = em.createQuery("select v from Ville v");
			villes = q.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return villes;
	}

	public List<Ville> getByMotCle(String paramMotCle) {
		List<Ville> villes = null;
		try {
			Query q = em.createQuery("select v from Ville v where v.libelle like :pLib");
			q.setParameter("pLib", paramMotCle + "%");
			villes = q.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return villes;
	}

	public Ville getById(Integer paramId) {
		Query q = em.createQuery("select v from Ville v where v.id = :pId");
		q.setParameter("pId", paramId);
		return (Ville) q.getSingleResult();
	}

	public List<Ville> getByCodePostal(String paramCp) {
		Query q = em.createQuery("select v from Ville v where v.cp like :pCp");
		q.setParameter("pCp", paramCp + "%");
		return q.getResultList();
	}

}
