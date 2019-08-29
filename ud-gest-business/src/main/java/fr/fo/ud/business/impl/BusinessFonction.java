package fr.fo.ud.business.impl;

import java.util.List;

import fr.fo.ud.business.api.IBusinessFederation;
import fr.fo.ud.business.api.IBusinessFonction;
import fr.fo.ud.data.api.IDaoFonction;
import fr.fo.ud.entity.Fonction;

public class BusinessFonction implements IBusinessFonction{

    private IDaoFonction daoFonction;
    
    public Fonction add(Fonction paramFonction) {
        return daoFonction.add(paramFonction);
    }

    public Fonction update(Fonction paramFonction) {
        return daoFonction.update(paramFonction);
    }

    public Fonction delete(Fonction paramFonction) {
        return daoFonction.delete(paramFonction);
    }

    public List<Fonction> getAll() {
        return daoFonction.getAll();
    }

    public List<Fonction> getByMotCle(String paramMotCle) {
        return daoFonction.getByMotCle(paramMotCle);
    }

    public Fonction getById(Integer paramId) {
        return daoFonction.getById(paramId);
    }

}
