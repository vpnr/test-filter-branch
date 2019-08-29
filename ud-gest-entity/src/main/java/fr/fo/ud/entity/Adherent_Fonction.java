package fr.fo.ud.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "adherent_fonction")
public class Adherent_Fonction implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne
	@JoinColumn(name = "id_adherent")
	private Adherent adherent;
	
	@Id
    @ManyToOne
    @JoinColumn(name = "id_fonction")
    private Fonction fonction;
	
	@Column(name = "date_debut_fonction", nullable = true)
	private Date dateDebut;
	
	@Column(name = "date_fin_fonction", nullable = true)
	private Date dateFin;

    public Adherent_Fonction() {
        super();
    }

    public Adherent_Fonction(Adherent paramAdherent, Fonction paramFonction, Date paramDateDebut, Date paramDateFin) {
        super();
        adherent = paramAdherent;
        fonction = paramFonction;
        dateDebut = paramDateDebut;
        dateFin = paramDateFin;
    }

    public Adherent getAdherent() {
        return adherent;
    }

    public void setAdherent(Adherent paramAdherent) {
        adherent = paramAdherent;
    }

    public Fonction getFonction() {
        return fonction;
    }

    public void setFonction(Fonction paramFonction) {
        fonction = paramFonction;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date paramDateDebut) {
        dateDebut = paramDateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date paramDateFin) {
        dateFin = paramDateFin;
    }

}
