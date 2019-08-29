package fr.fo.ud.data.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.fo.ud.data.api.IDaoSection;
import fr.fo.ud.entity.Section;

public class DaoSectionImpl implements IDaoSection{

    @PersistenceContext(unitName = "Udgest_Entity")
    private EntityManager em;

    public Section add(Section paramSection) {
        em.persist(paramSection);
        return paramSection;
    }

    public Section update(Section paramSection) {
        em.merge(paramSection);
        return paramSection;
    }

    public Section delete(Section paramSection) {
        em.remove(paramSection);
        return paramSection;
    }

    public Section getById(Integer paramId) {
        Query q = em.createQuery("select s from Section s where s.id =:pId");
        q.setParameter("pId", paramId);
        return (Section) q.getSingleResult();
    }

    public List<Section> getAll() {
        Query q = em.createQuery("select s from Section s order by s.libelle");
        return q.getResultList();
    }

    public List<Section> getByMotCle(String paramMotCle) {
        Query q = em.createQuery("select s from Section s left join fetch s.adherents where s.libelle like :pLibelle order by p.libelle");
        q.setParameter("pLibelle", paramMotCle);
        return q.getResultList();
    }
    
}
