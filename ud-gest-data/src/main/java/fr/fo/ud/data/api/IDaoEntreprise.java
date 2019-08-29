package fr.fo.ud.data.api;

import java.util.List;

import fr.fo.ud.entity.Entreprise;
import fr.fo.ud.entity.Ville;

/**
 * Definition des services liées a la persistence pour l'entite {@link Entreprise}.
 * @author myPC
 *
 */
public interface IDaoEntreprise {

	/**
	 * Methode permettant d'ajouter une {@link Entreprise} dans l'unite de persistence.
	 * @param entreprise
	 * @return
	 */
	Entreprise add(Entreprise entreprise);
	
	/**
	 * Methode permettant de modifier une {@link Entreprise} dans l'unité de persistence.
	 * @param entreprise
	 * @return
	 */
	Entreprise update(Entreprise entreprise);
	
	/**
	 * Methode permettant de supprimer une {@link Entreprise} dans l'unité de persitence.
	 * @param entreprise
	 * @return
	 */
	Entreprise delete(Entreprise entreprise);
	
	/**
	 * methode permettant de rechercher une {@link Entreprise} selon son id dans l'unité de persistence.
	 * @param id
	 * @return
	 */
	Entreprise getById(Integer id);
	
	/**
	 * methode permettant de recuperer une liste de touts les entreprises de l'unite de persistence.
	 * @return
	 */
	List<Entreprise> getAll();
	
    /**
     * Methode permettant de rechercher des {@link Entreprise} selon un mot clé.
     * @param motCle
     * @return
     */
    List<Entreprise> getByMotCle(String motCle);
    
    /**
     * Methode permettant de rechercher une {@link Entreprise} selon sa ville dans l'unité de persistence.
     * @param ville
     * @return
     */
    List<Entreprise> getByVille(Ville ville);
    
}
