package fr.fo.ud.business.api;

import java.util.List;

import fr.fo.ud.entity.Syndicat;
import fr.fo.ud.entity.Ville;

public interface IBusinessSyndicat {

	Syndicat add(Syndicat syndicat);
	
	Syndicat update(Syndicat syndicat);
	
	Syndicat delete(Syndicat syndicat);
	
	List<Syndicat> getAll();
	
	Syndicat getById(Integer id);
	
	List<Syndicat> getByMotCle(String motCle);
	
	List<Syndicat> getByVille(Ville ville);
	
}
