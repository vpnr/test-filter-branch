package fr.fo.ud.data.api;

import java.util.List;

import fr.fo.ud.entity.Federation;

public interface IDaoFederation {

    Federation add(Federation federation);
    
    Federation update(Federation federation);
    
    Federation delete(Federation federation);
    
    Federation getById(Integer id);
    
    List<Federation> getAll();
    
    List<Federation> getByMotCle(String motCle);
}
