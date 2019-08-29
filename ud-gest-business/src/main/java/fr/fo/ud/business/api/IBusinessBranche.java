package fr.fo.ud.business.api;

import java.util.List;

import fr.fo.ud.entity.Branche;

public interface IBusinessBranche {

    Branche add(Branche branche);
    
    Branche update(Branche branche);
    
    Branche delete(Branche branche);
    
    Branche getById(Integer id);
    
    List<Branche> getAll();
    
    List<Branche> getByMotCle(String motCle);
}
