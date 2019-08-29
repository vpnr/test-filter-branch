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
@Table(name = "fonction")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Fonction implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_fonction")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "libelle_fonction", nullable = false, length = 100)
    private String libelle;
    
    @OneToMany(mappedBy = "adherent")
    private List<Adherent_Fonction> adherentFonctions;
    
    public Fonction() {
		super();
	}
    
	public Fonction(Integer paramId, String paramLibelle) {
        super();
        id = paramId;
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

	public List<Adherent_Fonction> getAdherents() {
		return adherentFonctions;
	}

	public void setAdherents(List<Adherent_Fonction> paramAdherents) {
		adherentFonctions = paramAdherents;
	}
	
	

}
