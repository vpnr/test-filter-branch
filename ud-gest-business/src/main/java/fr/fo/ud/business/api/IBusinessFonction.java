package fr.fo.ud.business.api;

import java.util.List;

import fr.fo.ud.entity.Fonction;

public interface IBusinessFonction {

    Fonction add(Fonction fonction);
    Fonction update(Fonction fonction);
    Fonction delete(Fonction fonction);
    List<Fonction> getAll();
    List<Fonction> getByMotCle(String motCle);
    Fonction getById(Integer id);
    
}
