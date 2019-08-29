package fr.fo.ud.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe reprensentant la table {@link Utilisateur} dans l'unite de persistence.
 * @author myPC
 *
 */

@Entity
@Table(name = "utilisateur")
public class Utilisateur implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_utilisateur")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "login_utilisateur", nullable = false, length = 45)
    private String login;
    
    @Column(name = "mdp_utilisateur", nullable = false, length = 10)
    private String mdp;

    /**
     * 
     */
    public Utilisateur() {

    }

    /**
     * @param paramId
     * @param paramLogin
     * @param paramMdp
     */
    public Utilisateur(Integer paramId, String paramLogin, String paramMdp) {
        super();
        id = paramId;
        login = paramLogin;
        mdp = paramMdp;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param paramId the id to set
     */
    public void setId(Integer paramId) {
        id = paramId;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param paramLogin the login to set
     */
    public void setLogin(String paramLogin) {
        login = paramLogin;
    }

    /**
     * @return the mdp
     */
    public String getMdp() {
        return mdp;
    }

    /**
     * @param paramMdp the mdp to set
     */
    public void setMdp(String paramMdp) {
        mdp = paramMdp;
    }
    
}
