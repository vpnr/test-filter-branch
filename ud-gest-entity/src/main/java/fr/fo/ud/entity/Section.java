package fr.fo.ud.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "section")
public class Section implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "id_section")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "libelle_section", nullable = false, length = 45)
    private String libelle;
    
    @Column(name = "numero_rue", nullable = true, length = 10)
    private String numeroRue;
    
    @Column(name = "libelle_rue", nullable = true, length = 150)
    private String libelleRue;
    
    @Column(name = "tel_section", nullable = true, length = 15)
    private String tel;
    
    @Column(name = "fax_section", nullable = true, length = 15)
    private String fax;
    
    @Column(name = "mail_section", nullable = true, length = 100)
    private String mail;
    
    @Column(name = "siteweb_section", nullable = true, length = 150)
    private String siteWeb;

    @ManyToOne
    @JoinColumn(name = "id_ville_section", nullable = true)
    private Ville ville;
    
    @ManyToOne
    @JoinColumn(name = "id_syndicat_section", nullable = false)
    private Syndicat syndicat;

	public Section() {
		super();
	}

	public Section(Integer paramId, String paramLibelle, String paramNumeroRue, String paramLibelleRue, String paramTel,
            String paramFax, String paramMail, String paramSiteWeb, Ville paramVille, Syndicat paramSyndicat) {
        super();
        id = paramId;
        libelle = paramLibelle;
        numeroRue = paramNumeroRue;
        libelleRue = paramLibelleRue;
        tel = paramTel;
        fax = paramFax;
        mail = paramMail;
        siteWeb = paramSiteWeb;
        ville = paramVille;
        syndicat = paramSyndicat;
    }

    public Integer getId() {
		return id;
	}

	public void setId(Integer paramId) {
		id = paramId;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String paramLibelle) {
		libelle = paramLibelle;
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

	public String getTel() {
		return tel;
	}

	public void setTel(String paramTel) {
		tel = paramTel;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String paramFax) {
		fax = paramFax;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String paramMail) {
		mail = paramMail;
	}

	public String getSiteWeb() {
		return siteWeb;
	}

	public void setSiteWeb(String paramSiteWeb) {
		siteWeb = paramSiteWeb;
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
	
}
