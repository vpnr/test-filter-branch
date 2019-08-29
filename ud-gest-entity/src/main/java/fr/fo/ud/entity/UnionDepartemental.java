package fr.fo.ud.entity;

import java.io.Serializable;
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

@Entity
@Table(name = "ud")
public class UnionDepartemental implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "id_ud")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "libelle_ud", nullable = false, length = 45)
    private String libelle;
    
    @Column(name = "numero_rue", nullable = true, length = 10)
    private String numeroRue;
    
    @Column(name = "libelle_rue", nullable = true, length = 150)
    private String libelleRue;
    
    @Column(name = "tel_ud", nullable = true, length = 15)
    private String tel;
    
    @Column(name = "fax_ud", nullable = true, length = 15)
    private String fax;
    
    @Column(name = "mail_ud", nullable = true, length = 100)
    private String mail;
    
    @Column(name = "siteweb_ud", nullable = true, length = 150)
    private String siteWeb;
    
    @ManyToOne
    @JoinColumn(name = "id_ville_ud", nullable = true)
    private Ville ville;
    
    @OneToMany(mappedBy = "ud")
    private List<Syndicat> syndicats;

	public UnionDepartemental() {
		super();
	}

	public UnionDepartemental(Integer paramId, String paramLibelle, String paramNumeroRue, String paramLibelleRue,
			String paramTel, String paramFax, String paramMail, String paramSiteWeb, Ville paramVille) {
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

	public List<Syndicat> getSyndicats() {
		return syndicats;
	}

	public void setSyndicats(List<Syndicat> paramSyndicats) {
		syndicats = paramSyndicats;
	}
	
}
