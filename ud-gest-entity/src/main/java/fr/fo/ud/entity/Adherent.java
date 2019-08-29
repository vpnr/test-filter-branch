package fr.fo.ud.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Classe representant la table {@link Adherent}.
 * @author myPC
 *
 */

@Entity
@Table(name = "adherent")
public class Adherent implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_adherent")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "nom_adherent", nullable = false, length = 45)
    private String nom;
    
    @Column(name = "prenom_adherent", nullable = true, length = 45)
    private String prenom;
    
    @Column(name = "dob_adherent", nullable = true)
    private Date dob;
    
    @Column(name = "numero_rue", nullable = true, length = 10)
    private String numeroRue;
    
    @Column(name = "libelle_rue", nullable = true, length = 150)
    private String libelleRue;
    
    @Column(name = "tel_adherent", nullable = true, length = 15)
    private String tel;
    
    @Column(name = "mail_adherent", nullable = true, length = 100)
    private String mail;

    @ManyToOne
    @JoinColumn(name = "id_ville_adherent", nullable = true)
    private Ville ville;
    
    @ManyToOne
    @JoinColumn(name = "id_syndicat_adherent", nullable = true)
    private Syndicat syndicat;
    
    @ManyToOne
    @JoinColumn(name = "id_section_adherent", nullable = true)
    private Section section;
    
//    @ManyToOne
//    @JoinColumn(name = "id_groupement_adherent", nullable = true)
//    private Groupement groupement;
    
    @ManyToOne
    @JoinColumn(name = "id_federation_adherent", nullable = true)
    private Federation federation;
    
    @ManyToOne
    @JoinColumn(name = "id_ud_adherent", nullable = true)
    private UnionDepartemental ud;
    
    @ManyToOne
    @JoinColumn(name = "id_entreprise_adherent", nullable = true)
    private Entreprise entreprise;
    
    @OneToMany(mappedBy = "fonction")
    private List<Adherent_Fonction> fonctions;
    
    @OneToMany(mappedBy = "formation")
    private List<Adherent_Formation> formations;
    
    public Adherent() {
		super();
	}
    
    public Adherent(Integer paramId, String paramNom, String paramPrenom, Date paramDob, String paramNumeroRue,
            String paramLibelleRue, String paramTel, String paramMail, Ville paramVille, Syndicat paramSyndicat,
            Section paramSection, Federation paramFederation, UnionDepartemental paramUd,
            Entreprise paramEntreprise) {
        super();
        id = paramId;
        nom = paramNom;
        prenom = paramPrenom;
        dob = paramDob;
        numeroRue = paramNumeroRue;
        libelleRue = paramLibelleRue;
        tel = paramTel;
        mail = paramMail;
        ville = paramVille;
        syndicat = paramSyndicat;
        section = paramSection;
        //groupement = paramGroupement;
        federation = paramFederation;
        ud = paramUd;
        entreprise = paramEntreprise;
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
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param paramNom the nom to set
     */
    public void setNom(String paramNom) {
        nom = paramNom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param paramPrenom the prenom to set
     */
    public void setPrenom(String paramPrenom) {
        prenom = paramPrenom;
    }

    /**
     * @return the dob
     */
    public Date getDob() {
        return dob;
    }

    /**
     * @param paramDob the dob to set
     */
    public void setDob(Date paramDob) {
        dob = paramDob;
    }

    /**
     * @return the tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param paramTel the tel to set
     */
    public void setTel(String paramTel) {
        tel = paramTel;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param paramMail the mail to set
     */
    public void setMail(String paramMail) {
        mail = paramMail;
    }
    

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville paramVille) {
		ville = paramVille;
	}

	public Syndicat getSyndicat() {
		return syndicat;
	}

	public void setSyndicat(Syndicat paramSyndicat) {
		syndicat = paramSyndicat;
	}

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise paramEntreprise) {
		entreprise = paramEntreprise;
	}

	public List<Adherent_Fonction> getFonctions() {
		return fonctions;
	}

	public void setFonctions(List<Adherent_Fonction> paramFonctions) {
		fonctions = paramFonctions;
	}

	public List<Adherent_Formation> getFormations() {
		return formations;
	}

	public void setFormations(List<Adherent_Formation> paramFormations) {
		formations = paramFormations;
	}

	public String getNumeroRue() {
		return numeroRue;
	}

	public void setNumeroRue(String paramNumeroRue) {
		numeroRue = paramNumeroRue;
	}

	public String getLibelleRue() {
		return libelleRue;
	}

	public void setLibelleRue(String paramLibelleRue) {
		libelleRue = paramLibelleRue;
	}

    public Section getSection() {
        return section;
    }

    public void setSection(Section paramSection) {
        section = paramSection;
    }

    public Federation getFederation() {
        return federation;
    }

    public void setFederation(Federation paramFederation) {
        federation = paramFederation;
    }

    public UnionDepartemental getUd() {
        return ud;
    }

    public void setUd(UnionDepartemental paramUd) {
        ud = paramUd;
    }

}
