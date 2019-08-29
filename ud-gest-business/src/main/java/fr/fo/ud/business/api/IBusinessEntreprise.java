package fr.fo.ud.business.api;

import java.util.List;

import fr.fo.ud.entity.Adherent;
import fr.fo.ud.entity.Entreprise;
import fr.fo.ud.entity.Ville;

public interface IBusinessEntreprise {

	Entreprise add(Entreprise entreprise);
	
	Entreprise update(Entreprise entreprise);
	
	Entreprise delete(Entreprise entreprise);
	
	Entreprise getById(Integer id);
	
	List<Entreprise> getAll();
	
	List<Entreprise> getByMotCle(String motCle);
	
	List<Entreprise> getByVille(Ville ville);
	
	List<Entreprise> getEntrepriseByAdherent(Adherent adherent);
	
}
