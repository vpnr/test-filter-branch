package fr.fo.ud.data.api;

import java.util.List;

import fr.fo.ud.entity.Syndicat;
import fr.fo.ud.entity.Ville;

/**
 * Definition des services liées a la persiste pour l'entite {@link Synidcat};
 * @author myPC
 *
 */
public interface IDaoSyndicat {

	/**
	 * Methode permettant d'ajouter un {@link Syndicat} dans l'unite de persistence.
	 * @param syndicat
	 * @return
	 */
	Syndicat add(Syndicat syndicat);
	
	/**
	 * Methode permettant de modifier un {@link Syndicat} dans l'unité de persistence.
	 * @param syndicat
	 * @return
	 */
	Syndicat update(Syndicat syndicat);
	
	/**
	 * Methode permettant de supprimer un {@link Syndicat} dans l'unite de persistence.
	 * @param syndicat
	 * @return
	 */
	Syndicat delete(Syndicat syndicat);
	
	/**
	 * Methode permettant de rechercher un {@link Syndicat} selon son identifiant dans l'unite de persistence.
	 * @param id
	 * @return
	 */
	Syndicat getById(Integer id);
	
	/**
	 * Methode permettant de rchercher tous les {@link Syndicat} de l'unité de persistence.
	 * @return
	 */
	List<Syndicat> getAll();
	
	/**
	 * Methode permettant de rechercher un {@link Syndicat} selon sa ville dans l'unite de persistence.
	 * @param ville
	 * @return
	 */
	List<Syndicat> getByVille(Ville ville);
	
    /**
     * methode permettant de rechercher les {@link Syndicat} selon un mot clé.
     * @param nom
     * @return
     */
    List<Syndicat> getByMotCle(String motCle);
}
