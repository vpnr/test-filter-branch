package fr.fo.ud.data.api;

import java.util.List;

import fr.fo.ud.entity.Adherent;
import fr.fo.ud.entity.Formation;

public interface IDaoFormation {

	Formation add(Formation formation);
	
	Formation update(Formation formation);
	
	Formation delete(Formation formation);
	
	Formation getById(Integer id);
	
	List<Formation> getAll();
	
	List<Formation> getByMotCle(String motCle);
	
	List<Formation> getByAdherent(Adherent adherent);
	
}
