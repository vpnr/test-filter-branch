package fr.fo.ud.data.api;

import fr.fo.ud.entity.Utilisateur;
/**
 * Definition des services liées a la persistance pour l'entite {@link Utilisateur}.
 * @author myPC
 *
 */
public interface IDaoUtilisateur {
    
	/**
	 * Methode permettant un {@link Utilisateur} dans l'unite de persistence.
	 * @param user
	 * @return
	 */
	Utilisateur add(Utilisateur user);
	
	/**
	 * Methode permettant de modifier les informations d'un {@link Utilisateur} dans l'unite de persistence.
	 * @param user
	 * @return
	 */
	Utilisateur update(Utilisateur user);
	
	/**
	 * Methode permettant de supprimer un {@link Utilisateur} dans l'unite de persistence.
	 * @param user
	 * @return
	 */
	Utilisateur delete(Utilisateur user);
	
	/**
	 * Methode permettant de rechercher un {@link Utilisateur} selon son identifiant dans l'unite de persistence.
	 * @param id
	 * @return
	 */
	Utilisateur getById(Integer id);
	
    /**
     * Methode permettant a un utilisateur de se connecter a l'application moyennant une concordance entre son login et son mot de passe.
     * @param login login de l'utilisateur.
     * @param mdp mot de passe de l'utilisateur
     * @return 
     */
    Utilisateur connexion(String login, String mdp);
    
    /**
     * methode permettant a un utilisateur de se deconnecter.
     */
    void deconnexion();

}
