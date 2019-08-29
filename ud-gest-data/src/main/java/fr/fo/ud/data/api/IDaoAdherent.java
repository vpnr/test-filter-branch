package fr.fo.ud.data.api;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.fo.ud.entity.Adherent;
import fr.fo.ud.entity.Entreprise;
import fr.fo.ud.entity.Fonction;
import fr.fo.ud.entity.Formation;
import fr.fo.ud.entity.Syndicat;

/**
 * Definition des services li�es a la persistence pour l'entite {@link Adherent}.
 * @author myPC
 *
 */
public interface IDaoAdherent {

	/**
	 * Methode permettant d'ajouter un {@link Adherent} dans l'unit� de persistence.
	 * @param adh un adherent
	 * @return
	 */
    Adherent add(Adherent adh);
    
    /**
     * Methode permettant de modifier les informations d'un adherent dans l'unite de persistence.
     * @param adh
     * @return
     */
    Adherent update(Adherent adh);
    
    /**
     * Methode permettant de supprimer un adherent dans l'unit� de persistence.
     * @param adh
     * @return
     */
    Adherent delete(Adherent adh);
    
    Adherent findById(Integer id);
    
    /**
     * methode permettant de rechercher des {@link Adherent} dans l'unite de persistence selon un mot cl�.
     * exemple :
     * <ul>
     *  <li>recherche partiel dans le nom</li>
     *  <li>recherche partiel dans le prenom</li>
     * </ul>
     * @param nom le nom de l'adherent.
     * @return
     */
    List<Adherent> findByNom(String nom);
    
    /**
     * Methode permetttant d'effectuer une recherhce generale en fonction d'un mot cl� sur :
     * <ul>
     * <li>Le nom</li>
     * <li>Le prenom</li>
     * <li>L'entreprise</li>
     * <li>Le syndicat</li>
     * <li>Les fonctions</li>
     * <li>Les formations</li>
     * <li>La ville</li>
     * <li>Le code postal</li>
     * </ul>
     * @param motCle
     * @return
     */
    List<Adherent> findByMotCle(String motCle);
    
    /**
     * Methode permettant d'effectuer une recherche d'adherent en fonction de la ville.
     * @param ville
     * @return
     */
    List<Adherent> findByVille(String ville);
    
    /**
     * Methode permettant d'effectuer une recherche d'adherent selon un code postal.
     * @param codePostal
     * @return
     */
    List<Adherent> findByCodePostal(String codePostal);
    
    /**
     * methode permettant d'effectuer une recherche {@link Adherent} dans l'unite de persistence selon une entreprise.
     * @param entreprise une entreprise.
     * @return
     */
    List<Adherent> findByEntreprise(Entreprise entreprise);
    
    /**
     * methode permettant d'effectuer une recherche {@link Adherent} en fonction du syndicat auquel il appartient.
     * @param syndicat un syndicat.
     * @return
     */
    List<Adherent> findBySyndicat(Syndicat syndicat);
    
    List<Adherent> findByFormation(Formation formation);
    
    List<Adherent> findByFonction(Fonction fonction);
}
