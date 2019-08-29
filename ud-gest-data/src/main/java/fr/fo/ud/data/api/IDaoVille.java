package fr.fo.ud.data.api;

import java.util.List;

import fr.fo.ud.entity.Ville;

public interface IDaoVille {

	/**
	 * Methode permettant de recuperer toutes les {@link Ville} de l'unite de persistence.
	 * @return
	 */
	List<Ville> getAll();
	
	/**
	 * Methode permettant de faire une recherche de {@link Ville} partiel selon un mot-clé.
	 * @param motCle
	 * @return
	 */
	List<Ville> getByMotCle(String motCle);
	
	/**
	 * Methode permettant de rechercher une {@link Ville} selon son identifiant dans l'unite de persistence.
	 * @param id
	 * @return
	 */
	Ville getById(Integer id);
	
	/**
	 * Methode permettant de rechercher une liste de ville en fonction de leurs code postaux dans l'unite de persistence.
	 * @param cp
	 * @return
	 */
	List<Ville> getByCodePostal(String cp);

}
