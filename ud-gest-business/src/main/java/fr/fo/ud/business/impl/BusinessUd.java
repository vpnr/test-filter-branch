package fr.fo.ud.business.impl;

import java.util.List;

import fr.fo.ud.business.api.IBusinessUd;
import fr.fo.ud.data.api.IDaoUd;
import fr.fo.ud.entity.UnionDepartemental;

public class BusinessUd implements IBusinessUd{

    private IDaoUd daoUd;

    public UnionDepartemental add(UnionDepartemental paramUd) {
        return daoUd.add(paramUd);
    }

    public UnionDepartemental update(UnionDepartemental paramUd) {
        return daoUd.update(paramUd);
    }

    public UnionDepartemental delete(UnionDepartemental paramUd) {
        return daoUd.delete(paramUd);
    }

    public UnionDepartemental getById(Integer paramId) {
        return daoUd.getById(paramId);
    }

    public List<UnionDepartemental> getAll() {
        return daoUd.getAll();
    }

    public List<UnionDepartemental> getByMotCle(String paramMotCle) {
        return daoUd.getByMotCle(paramMotCle);
    }
    
    
}
