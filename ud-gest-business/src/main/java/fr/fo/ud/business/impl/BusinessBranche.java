package fr.fo.ud.business.impl;

import java.util.List;

import fr.fo.ud.business.api.IBusinessBranche;
import fr.fo.ud.data.api.IDaoBranche;
import fr.fo.ud.entity.Branche;

public class BusinessBranche implements IBusinessBranche{

    private IDaoBranche daoBranche;
    
    public Branche add(Branche paramBranche) {
        return daoBranche.add(paramBranche);
    }

    public Branche update(Branche paramBranche) {
        return daoBranche.update(paramBranche);
    }

    public Branche delete(Branche paramBranche) {
        return daoBranche.delete(paramBranche);
    }

    public Branche getById(Integer paramId) {
        return daoBranche.getById(paramId);
    }

    public List<Branche> getAll() {
        return daoBranche.getAll();
    }

    public List<Branche> getByMotCle(String paramMotCle) {
        return daoBranche.getByMotCle(paramMotCle);
    }

    
}
