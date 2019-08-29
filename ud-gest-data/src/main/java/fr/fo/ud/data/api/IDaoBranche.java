package fr.fo.ud.data.api;

import java.util.List;

import fr.fo.ud.entity.Branche;
import fr.fo.ud.entity.Federation;

public interface IDaoBranche {

    Branche add(Branche branche);
    
    Branche update(Branche branche);
    
    Branche delete(Branche branche);
    
    Branche getById(Integer id);
    
    List<Branche> getAll();
    
    List<Branche> getByMotCle(String motCle);
    
    List<Branche> getByFederation(Federation federation);
}
