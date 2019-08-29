package fr.fo.ud.data.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.fo.ud.data.api.IDaoBranche;
import fr.fo.ud.entity.Branche;
import fr.fo.ud.entity.Federation;

public class DaoBrancheImpl implements IDaoBranche {

    @PersistenceContext(unitName = "Udgest_Entity")
    private EntityManager em;
    
    public Branche add(Branche paramBranche) {
        em.persist(paramBranche);
        return paramBranche;
    }

    public Branche update(Branche paramBranche) {
        em.merge(paramBranche);
        return paramBranche;
    }

    public Branche delete(Branche paramBranche) {
        em.remove(paramBranche);
        return paramBranche;
    }

    public Branche getById(Integer paramId) {
        Query q = em.createQuery("select b from Branche b left join fecth b.syndicats where b.id =:pId order by b.libelle");
        q.setParameter("pId", paramId);
        return (Branche) q.getSingleResult();
    }

    public List<Branche> getAll() {
        Query q = em.createQuery("select b from Branche b left join fetch b.syndicats order by b.libelle");
        return q.getResultList();
    }

    public List<Branche> getByMotCle(String paramMotCle) {
        Query q = em.createQuery("select b from Branche b left join fetch b.syndicats where b.libelle like :pLibelle order by b.libelle");
        q.setParameter("pLibelle", paramMotCle + "%");
        return q.getResultList();
    }

    public List<Branche> getByFederation(Federation paramFederation) {
        Query q = em.createQuery("select b from Branche b left join fetch b.syndicats where b.federation =:pFederation order by b.libelle");
        q.setParameter("pFederation", paramFederation);
        return q.getResultList();
    }
    
    

}
