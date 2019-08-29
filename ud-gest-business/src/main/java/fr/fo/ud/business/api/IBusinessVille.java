package fr.fo.ud.business.api;

import java.util.List;

import fr.fo.ud.entity.Ville;

public interface IBusinessVille {

	Ville getById(Integer id);
	
	List<Ville> getAll();
	
	List<Ville> getByMotCle(String motCle);
	
	List<Ville> getByCodePostal(String cp);
	
}
