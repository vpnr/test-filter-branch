package fr.fo.ud.business.api;

import java.util.List;

import fr.fo.ud.entity.Section;

public interface IBusinessSection {

    Section add(Section section);
    
    Section update(Section section);
    
    Section delete(Section section);
    
    Section getById(Integer id);
    
    List<Section> getAll();
    
    List<Section> getByMotCle(String motCle);
}
