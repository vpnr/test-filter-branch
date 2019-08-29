package fr.fo.ud.business.api;

import java.util.List;

import fr.fo.ud.entity.Formation;

public interface IBusinessFormation {

    Formation add(Formation formation);
    Formation update(Formation formation);
    Formation delete(Formation formation);
    List<Formation> getAll();
    List<Formation> getByMotCle(String motCle);
    Formation getById(Integer id);
}
