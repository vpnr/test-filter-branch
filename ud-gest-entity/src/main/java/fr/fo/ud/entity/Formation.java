package fr.fo.ud.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "formation")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Formation implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_formation")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "libelle_formation", nullable = false, length = 45)
    private String libelle;
    
    @Column(name = "description_formation", nullable = true, length = 300)
    private String description;
    
    @OneToMany(mappedBy = "adherent")
    private List<Adherent_Formation> adherents;
    
    public Formation() {
		super();
	}

	public Formation(Integer paramId, String paramLibelle, String paramDescription) {
		super();
		id = paramId;
		libelle = paramLibelle;
		description = paramDescription;
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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param paramDescription the description to set
     */
    public void setDescription(String paramDescription) {
        description = paramDescription;
    }

	public List<Adherent_Formation> getAdherents() {
		return adherents;
	}

	public void setAdherents(List<Adherent_Formation> paramAdherents) {
		adherents = paramAdherents;
	}
    
}
