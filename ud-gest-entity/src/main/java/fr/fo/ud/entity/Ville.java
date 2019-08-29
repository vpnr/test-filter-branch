package fr.fo.ud.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Classe representant l'entite {@link Ville} dans l'unite de persistence.
 * @author myPC
 *
 */

@Entity
@Table(name = "ville")
public class Ville implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_ville")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "cp_ville", nullable = false, length = 10)
    private String cp;
    
    @Column(name = "libelle_ville", nullable = false, length = 45)
    private String libelle;
    
    @OneToMany(mappedBy = "ville")
    private List<Adherent> adherents;
    
    @OneToMany(mappedBy = "ville")
    private List<Entreprise> entreprises;
    
    @OneToMany(mappedBy = "ville")
    private List<Syndicat> syndicats;

    /**
     * Default constructor.
     */
    public Ville() {

    }
    
    public Ville(Integer paramId, String paramCp, String paramLibelle) {
		super();
		id = paramId;
		cp = paramCp;
		libelle = paramLibelle;
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
     * @return the cp
     */
    public String getCp() {
        return cp;
    }

    /**
     * @param paramCp the cp to set
     */
    public void setCp(String paramCp) {
        cp = paramCp;
    }

    /**
     * @return the libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * @param paramLibelle the libelle to set
     */
    public void setLibelle(String paramLibelle) {
        libelle = paramLibelle;
    }

	public List<Adherent> getAdherents() {
		return adherents;
	}

	public void setAdherents(List<Adherent> paramAdherents) {
		adherents = paramAdherents;
	}
    
}
