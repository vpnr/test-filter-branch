package fr.fo.ud.data.api;

import java.util.List;

import fr.fo.ud.entity.UnionDepartemental;

public interface IDaoUd {

    UnionDepartemental add(UnionDepartemental ud);
    
    UnionDepartemental update(UnionDepartemental ud);
    
    UnionDepartemental delete(UnionDepartemental ud);
    
    List<UnionDepartemental> getAll();
    
    UnionDepartemental getById(Integer id);
    
    List<UnionDepartemental> getByMotCle(String motCle);
    
}
