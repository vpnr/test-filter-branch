package fr.fo.ud.data.api;

import java.util.List;

import fr.fo.ud.entity.Section;

public interface IDaoSection {

    Section add(Section section);
    
    Section update(Section section);

    Section delete(Section section);
    
    Section getById(Integer id);
    
    List<Section> getAll();
    
    List<Section> getByMotCle(String motCle);
}
