package fr.fo.ud.data.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.fo.ud.data.api.IDaoFonction;
import fr.fo.ud.entity.Fonction;

public class DaoFonctionImpl implements IDaoFonction{

    @PersistenceContext(unitName = "Udgest_Entity")
    private EntityManager em;
    
    public Fonction add(Fonction paramFonction) {
        em.persist(paramFonction);
        return paramFonction;
    }

    public Fonction update(Fonction paramFonction) {
        em.merge(paramFonction);
        return paramFonction;
    }

    public Fonction delete(Fonction paramFonction) {
        em.remove(paramFonction);
        return paramFonction;
    }

    public Fonction getById(Integer paramId) {
        Query q = em.createQuery("select f from Fonction f where f.id =:pId order by f.libelle");
        q.setParameter("pId", paramId);
        return (Fonction) q.getSingleResult();
    }

    public List<Fonction> getAll() {
        Query q = em.createQuery("select f from Fonction f order by f.libelle");
        return q.getResultList();
    }

    public List<Fonction> getByMotCle(String paramMotCle) {
        Query q = em.createQuery("select f from Fonction f where f.libelle =:pLibelle order by f.libelle");
        q.setParameter("pLibelle", paramMotCle);
        return q.getResultList();
    }

    public List<Fonction> getFonctionEntreprise() {
        Query q = em.createQuery("select f from Fonction f where f.libelle like %CE% and f.libelle like %CHSCT% and f.libelle like %d�l�gu�% and f.libelle like %repr�sentant% order by f.libelle");
        return q.getResultList();
    }

    public List<Fonction> getFonctionSyndicat() {
        Query q = em.createQuery("select f from Fonction f where f.libelle like %syndicat% order by f.libelle");
        return q.getResultList();
    }

    public List<Fonction> getFonctionSection() {
        Query q = em.createQuery("select f from Fonction f where f.libelle like %section% order by f.libelle");
        return q.getResultList();
    }

    public List<Fonction> getFonctionBranche() {
        Query q = em.createQuery("select f from Fonction f where f.libelle like %branche% and f.libelle like %CPNEFP% order by f.libelle");
        return q.getResultList();
    }

    public List<Fonction> getFonctionUd() {
        Query q = em.createQuery("select f from Fonction f where f.libelle like %UD% order by f.libelle");
        return q.getResultList();
    }

    public List<Fonction> getFonctionFederation() {
        Query q = em.createQuery("select f from Fonction f where f.libelle like %federation% order by f.libelle");
        return q.getResultList();
    }

    public List<Fonction> getFonctionGroupement() {
        Query q = em.createQuery("select f from Fonction f where f.libelle like %groupement% order by f.libelle");
        return q.getResultList();
    }

}
