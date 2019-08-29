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
@Table(name = "branche")
public class Branche implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "id_branche")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "libelle_branche", nullable = false, length = 45)
    private String libelle;
    
    @ManyToOne
    @JoinColumn(name = "id_federation_branche", nullable = false)
    private Federation federation;
    
    @OneToMany(mappedBy = "branche")
    private List<Syndicat> syndicats;

	public Branche() {
		super();
	}

	public Branche(Integer paramId, String paramLibelle, Federation paramFederation, List<Syndicat> paramSyndicats) {
		super();
		id = paramId;
		libelle = paramLibelle;
		federation = paramFederation;
		syndicats = paramSyndicats;
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

	public Federation getFederation() {
		return federation;
	}

	public void setFederation(Federation paramFederation) {
		federation = paramFederation;
	}

	public List<Syndicat> getSyndicats() {
		return syndicats;
	}

	public void setSyndicats(List<Syndicat> paramSyndicats) {
		syndicats = paramSyndicats;
	}
    
    
}
