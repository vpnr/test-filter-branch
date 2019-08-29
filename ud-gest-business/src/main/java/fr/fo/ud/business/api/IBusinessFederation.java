package fr.fo.ud.business.api;

import java.util.List;

import fr.fo.ud.entity.Branche;
import fr.fo.ud.entity.Federation;

public interface IBusinessFederation {

    Federation add(Federation federation);
    
    Federation update(Federation federation);
    
    Federation delete(Federation federation);
    
    Federation getById(Integer id);
    
    List<Federation> getAll();
        
    List<Federation> getByMotCle(String motCle);
    
    List<Branche> getBranchesByFederation(Federation federation);
}
