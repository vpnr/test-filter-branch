package fr.fo.ud.business.impl;

import java.util.List;

import fr.fo.ud.business.api.IBusinessSection;
import fr.fo.ud.data.api.IDaoSection;
import fr.fo.ud.entity.Section;

public class BusinessSection implements IDaoSection {

    private IDaoSection daoSection;

    public Section add(Section paramSection) {
        return daoSection.add(paramSection);
    }

    public Section update(Section paramSection) {
        return daoSection.update(paramSection);
    }

    public Section delete(Section paramSection) {
        return daoSection.delete(paramSection);
    }

    public Section getById(Integer paramId) {
        return daoSection.getById(paramId);
    }

    public List<Section> getAll() {
        return daoSection.getAll();
    }

    public List<Section> getByMotCle(String paramMotCle) {
        return daoSection.getByMotCle(paramMotCle);
    }
    
}
