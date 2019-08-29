package fr.fo.ud.business.api;

import java.util.List;

import fr.fo.ud.entity.Adherent;
import fr.fo.ud.entity.Entreprise;
import fr.fo.ud.entity.Fonction;
import fr.fo.ud.entity.Formation;
import fr.fo.ud.entity.Syndicat;
import fr.fo.ud.entity.Ville;

public interface IBusinessAdherent {

	Adherent add(Adherent adh);
	
	Adherent update(Adherent adh);
	
	Adherent delete(Adherent adh);
	
	Adherent getById(Integer id);
	
	List<Adherent> getByMotCle(String motCle);
	
	List<Formation> getFormationByAdherent(Adherent adherent);
	
	List<Fonction> getFonctionByAdherent(Adherent adherent);
	
	List<Adherent> getByVille(Ville ville);
	
	List<Adherent> getBySyndicat(Syndicat syndicat);
	
	List<Adherent> getByEntreprise(Entreprise entreprise);
	
	List<Adherent> getByFonction(Fonction fonction);
	
	List<Adherent> getByFormation(Formation formation);
	
	Adherent addFonctionAdherent(Fonction fonction);
	
	Adherent deleteFonctionAdherent(Fonction fonction);
	
	Adherent updateFonctionAdherent(Fonction fonction);
	
	Adherent addFormationAdherent(Formation formation);
	
	
}
