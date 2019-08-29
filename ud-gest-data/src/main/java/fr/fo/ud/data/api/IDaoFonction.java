package fr.fo.ud.data.api;

import java.util.List;

import fr.fo.ud.entity.Adherent;
import fr.fo.ud.entity.Fonction;

public interface IDaoFonction {

	Fonction add(Fonction fonction);
	
	Fonction update(Fonction fonction);
	
	Fonction delete(Fonction fonction);
	
	Fonction getById(Integer id);
	
	List<Fonction> getAll();
	
	List<Fonction> getByMotCle(String motCle);
	
	List<Fonction> getFonctionEntreprise();
	
	List<Fonction> getFonctionSyndicat();
	
	List<Fonction> getFonctionSection();
	
	List<Fonction> getFonctionBranche();
	
	List<Fonction> getFonctionUd();
	
	List<Fonction> getFonctionFederation();
	
	List<Fonction> getFonctionGroupement();
	
}
