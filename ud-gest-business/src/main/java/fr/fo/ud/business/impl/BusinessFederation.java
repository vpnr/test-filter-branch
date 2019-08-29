package fr.fo.ud.business.impl;

import java.util.List;

import fr.fo.ud.business.api.IBusinessFederation;
import fr.fo.ud.data.api.IDaoBranche;
import fr.fo.ud.data.api.IDaoFederation;
import fr.fo.ud.entity.Branche;
import fr.fo.ud.entity.Federation;

public class BusinessFederation implements IBusinessFederation {

    private IDaoFederation daoFederation;
    
    private IDaoBranche daoBranche;
    
    public Federation add(Federation paramFederation) {
        return daoFederation.add(paramFederation);
    }

    public Federation update(Federation paramFederation) {
        return daoFederation.update(paramFederation);
    }

    public Federation delete(Federation paramFederation) {
        return daoFederation.delete(paramFederation);
    }

    public List<Federation> getAll() {
        return daoFederation.getAll();
    }

    public List<Federation> getByMotCle(String paramMotCle) {
        return daoFederation.getByMotCle(paramMotCle);
    }

    public Federation getById(Integer paramId) {
        return daoFederation.getById(paramId);
    }

    public List<Branche> getBranchesByFederation(Federation paramFederation) {
        return daoBranche.getByFederation(paramFederation);
    }
    
}
