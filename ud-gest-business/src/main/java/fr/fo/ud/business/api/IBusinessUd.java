package fr.fo.ud.business.api;

import java.util.List;

import fr.fo.ud.entity.UnionDepartemental;

public interface IBusinessUd {

    UnionDepartemental add(UnionDepartemental ud);
    
    UnionDepartemental update(UnionDepartemental ud);
    
    UnionDepartemental delete(UnionDepartemental ud);
    
    UnionDepartemental getById(Integer id);
    
    List<UnionDepartemental> getAll();
    
    List<UnionDepartemental> getByMotCle(String motCle);
}
