package fr.fo.ud.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.fo.ud.business.api.IBusinessAdherent;
import fr.fo.ud.data.api.IDaoAdherent;
import fr.fo.ud.data.api.IDaoVille;
import fr.fo.ud.entity.Adherent;
import fr.fo.ud.entity.Entreprise;
import fr.fo.ud.entity.Fonction;
import fr.fo.ud.entity.Formation;
import fr.fo.ud.entity.Syndicat;
import fr.fo.ud.entity.Ville;

@Service
public class BusinessAdherent implements IBusinessAdherent {

//	@Autowired
//	private IDaoVille daoVille;
	
	@Autowired
	private IDaoAdherent daoAdherent;
	
	public Adherent add(Adherent paramAdh) {
		daoAdherent.add(paramAdh);
		return paramAdh;
	}

	public Adherent update(Adherent paramAdh) {
		// TODO Auto-generated method stub
		return null;
	}

	public Adherent delete(Adherent paramAdh) {
		// TODO Auto-generated method stub
		return null;
	}

	public Adherent getById(Integer paramId) {
		return daoAdherent.findById(paramId);
	}

	public List<Formation> getFormationByAdherent(Adherent paramAdherent) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Fonction> getFonctionByAdherent(Adherent paramAdherent) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Adherent> getByMotCle(String paramMotCle) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Adherent> getByVille(Ville paramVille) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Adherent> getBySyndicat(Syndicat paramSyndicat) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Adherent> getByEntreprise(Entreprise paramEntreprise) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Adherent> getByFonction(Fonction paramFonction) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Adherent> getByFormation(Formation paramFormation) {
		// TODO Auto-generated method stub
		return null;
	}

    public Adherent addFonctionAdherent(Fonction paramFonction) {
        // TODO Auto-generated method stub
        return null;
    }

    public Adherent deleteFonctionAdherent(Fonction paramFonction) {
        // TODO Auto-generated method stub
        return null;
    }

    public Adherent updateFonctionAdherent(Fonction paramFonction) {
        // TODO Auto-generated method stub
        return null;
    }

    public Adherent addFormationAdherent(Formation paramFormation) {
        // TODO Auto-generated method stub
        return null;
    }


}
