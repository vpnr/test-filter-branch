package fr.fo.ud.data.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.fo.ud.data.api.IDaoUd;
import fr.fo.ud.entity.UnionDepartemental;

public class DaoUdImpl implements IDaoUd {

    @PersistenceContext(unitName = "Udgest_Entity")
    EntityManager em;
    
    public UnionDepartemental add(UnionDepartemental paramUd) {
        em.persist(paramUd);
        return paramUd;
    }

    public UnionDepartemental update(UnionDepartemental paramUd) {
        em.merge(paramUd);
        return paramUd;
    }

    public UnionDepartemental delete(UnionDepartemental paramUd) {
        em.remove(paramUd);
        return paramUd;
    }

    public List<UnionDepartemental> getAll() {
        Query q = em.createQuery("select u from UnionDepartemental u order by u.libelle");
        List<UnionDepartemental> uds;
        uds = q.getResultList();
        return uds;
    }

    public List<UnionDepartemental> getByMotCle(String paramMotCle) {
        Query q = em.createQuery("select u from UnionDepartemental u where u.libelle like :pLibelle or u.ville.libelle like :pVille order by u.libelle");
        q.setParameter("pLibelle", paramMotCle + "%");
        q.setParameter("pVille", paramMotCle + "%");
        return q.getResultList();
    }

    public UnionDepartemental getById(Integer paramId) {
        Query q = em.createQuery("select u from UnionDepartemental u left join fetch u.syndicats where u.id =:pId ");
        q.setParameter("pId", paramId);
        return (UnionDepartemental) q.getSingleResult();
    }

    
}
