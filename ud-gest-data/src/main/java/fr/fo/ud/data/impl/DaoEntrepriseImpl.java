package fr.fo.ud.data.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.fo.ud.data.api.IDaoEntreprise;
import fr.fo.ud.entity.Entreprise;
import fr.fo.ud.entity.Ville;

public class DaoEntrepriseImpl implements IDaoEntreprise {

	@PersistenceContext(unitName = "Udgest_Entity")
	EntityManager em;
	
	public Entreprise add(Entreprise paramEntreprise) {
		em.persist(paramEntreprise);
		return paramEntreprise;
	}

	public Entreprise update(Entreprise paramEntreprise) {
		// TODO Auto-generated method stub
		return null;
	}

	public Entreprise delete(Entreprise paramEntreprise) {
		// TODO Auto-generated method stub
		return null;
	}

	public Entreprise getById(Integer paramId) {
		Query q = em.createQuery("select e from Entreprise e left join fetch e.adherents where e.id =:pId");
		q.setParameter("pId", paramId);
		return (Entreprise) q.getSingleResult();
	}

	public List<Entreprise> getByMotCle(String paramMotCle) {
		Query q = em.createQuery("select e from Entreprise e  where e.libelle like :pLibelle order by e.libelle");
		q.setParameter("pLibelle", paramMotCle + "%");
		return q.getResultList();
	}

	public List<Entreprise> getByVille(Ville paramVille) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Entreprise> getAll() {
		Query q = em.createQuery("select e from Entreprise e order by e.libelle");
		return q.getResultList();
	}

	

}
