package fr.fo.ud.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "adherent_formation")
@IdClass(AssociationFormationId.class)
public class Adherent_Formation implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Integer idAdherent;
	
	@Id
	private Integer idFormation;
	
	@Column(name = "dateObtention", nullable = false)
	private Date dateObtention;
	
	@ManyToOne
	@PrimaryKeyJoinColumn(name = "id_adherent", referencedColumnName = "id_adherent")
	private Adherent adherent;
	
	@ManyToOne
	@PrimaryKeyJoinColumn(name = "id_formation", referencedColumnName = "id_formation")
	private Formation formation;

	public Adherent_Formation() {
		super();
	}

	public Adherent_Formation(Integer paramIdAdherent, Integer paramIdFormation, Date paramDateObtention,
			Adherent paramAdherent, Formation paramFormation) {
		super();
		idAdherent = paramIdAdherent;
		idFormation = paramIdFormation;
		dateObtention = paramDateObtention;
		adherent = paramAdherent;
		formation = paramFormation;
	}

	public Integer getIdAdherent() {
		return idAdherent;
	}

	public void setIdAdherent(Integer paramIdAdherent) {
		idAdherent = paramIdAdherent;
	}

	public Integer getIdFormation() {
		return idFormation;
	}

	public void setIdFormation(Integer paramIdFormation) {
		idFormation = paramIdFormation;
	}

	public Date getDateObtention() {
		return dateObtention;
	}

	public void setDateObtention(Date paramDateObtention) {
		dateObtention = paramDateObtention;
	}

	public Adherent getAdherent() {
		return adherent;
	}

	public void setAdherent(Adherent paramAdherent) {
		adherent = paramAdherent;
	}

	public Formation getFormation() {
		return formation;
	}

	public void setFormation(Formation paramFormation) {
		formation = paramFormation;
	}

}
