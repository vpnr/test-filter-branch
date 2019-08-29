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
 * Classe representant l'entite {@link Syndicat} dans l'unite de persistence.
 * @author myPC
 *
 */

@Entity
@Table(name = "syndicat")
public class Syndicat implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_syndicat")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "libelle_syndicat", nullable = false, length = 45)
    private String libelle;
    
    @Column(name = "dernier_ag", nullable = true)
    private Date dernierAg;
    
    @Column(name = "prochain_ag", nullable = true)
    private Date prochainAg;
    
    @Column(name = "numero_rue", nullable = true, length = 10)
    private String numeroRue;
    
    @Column(name = "libelle_rue", nullable = true, length = 150)
    private String libelleRue;
    
    @Column(name = "tel_syndicat", nullable = true, length = 15)
    private String tel;
    
    @Column(name = "fax_syndicat", nullable = true, length = 15)
    private String fax;
    
    @Column(name = "mail_syndicat", nullable = true, length = 100)
    private String mail;
    
    @Column(name = "siteweb_syndicat", nullable = true, length = 150)
    private String siteWeb;

    @ManyToOne
    @JoinColumn(name = "id_ville_syndicat", nullable = true)
    private Ville ville;
    
    @ManyToOne
    @JoinColumn(name = "id_branche_syndicat", nullable = true)
    private Branche branche;
    
    @ManyToOne
    @JoinColumn(name = "id_federation_syndicat", nullable = false)
    private Federation federation;
    
    @ManyToOne
    @JoinColumn(name = "id_ud_syndicat", nullable = false)
    private UnionDepartemental ud;
    
    @OneToMany(mappedBy = "syndicat")
    private List<Adherent> adherents;
    
    @OneToMany(mappedBy = "syndicat")
    private List<Section> sections;
    
    /**
     * Default constructor.
     */
    public Syndicat() {

    }
    
    public Syndicat(Integer paramId, String paramLibelle, Date paramDernierAg, Date paramProchainAg,
            String paramNumeroRue, String paramLibelleRue, String paramTel, String paramFax, String paramMail,
            String paramSiteWeb, Ville paramVille, Branche paramBranche, Federation paramFederation,
            UnionDepartemental paramUd) {
        super();
        id = paramId;
        libelle = paramLibelle;
        dernierAg = paramDernierAg;
        prochainAg = paramProchainAg;
        numeroRue = paramNumeroRue;
        libelleRue = paramLibelleRue;
        tel = paramTel;
        fax = paramFax;
        mail = paramMail;
        siteWeb = paramSiteWeb;
        ville = paramVille;
        branche = paramBranche;
        federation = paramFederation;
        ud = paramUd;
    }

    public Date getProchainAg() {
        return prochainAg;
    }

    public void setProchainAg(Date paramProchainAg) {
        prochainAg = paramProchainAg;
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

    /**
     * @return the tel
     */
    public String getTel() {
        return tel;
    }

    public Ville getVille() {
		return ville;
	}

	public void setVille(Ville paramVille) {
		ville = paramVille;
	}
    
    /**
     * @param paramTel the tel to set
     */
    public void setTel(String paramTel) {
        tel = paramTel;
    }

    /**
     * @return the fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * @param paramFax the fax to set
     */
    public void setFax(String paramFax) {
        fax = paramFax;
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

    /**
     * @return the siteWeb
     */
    public String getSiteWeb() {
        return siteWeb;
    }

    /**
     * @param paramSiteWeb the siteWeb to set
     */
    public void setSiteWeb(String paramSiteWeb) {
        siteWeb = paramSiteWeb;
    }

    /**
     * @return the adherents
     */
    public List<Adherent> getAdherents() {
        return adherents;
    }

    /**
     * @param paramAdherents the adherents to set
     */
    public void setAdherents(List<Adherent> paramAdherents) {
        adherents = paramAdherents;
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

	public Date getDernierAg() {
		return dernierAg;
	}

	public void setDernierAg(Date paramDernierAg) {
		dernierAg = paramDernierAg;
	}

	public List<Section> getSections() {
		return sections;
	}

	public void setSections(List<Section> paramSections) {
		sections = paramSections;
	}

	public UnionDepartemental getUd() {
		return ud;
	}

	public void setUd(UnionDepartemental paramUd) {
		ud = paramUd;
	}

	public Branche getBranche() {
		return branche;
	}

	public void setBranche(Branche paramBranche) {
		branche = paramBranche;
	}

    public Federation getFederation() {
        return federation;
    }

    public void setFederation(Federation paramFederation) {
        federation = paramFederation;
    }

}
