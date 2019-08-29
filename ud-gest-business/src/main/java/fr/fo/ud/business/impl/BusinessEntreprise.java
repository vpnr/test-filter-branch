package fr.fo.ud.business.impl;

import java.util.List;

import fr.fo.ud.business.api.IBusinessEntreprise;
import fr.fo.ud.data.api.IDaoEntreprise;
import fr.fo.ud.entity.Adherent;
import fr.fo.ud.entity.Entreprise;
import fr.fo.ud.entity.Ville;

public class BusinessEntreprise implements IBusinessEntreprise{

	private IDaoEntreprise daoEntreprise;
	
	public Entreprise add(Entreprise paramEntreprise) {
		return daoEntreprise.add(paramEntreprise);
	}

	public Entreprise update(Entreprise paramEntreprise) {
		// TODO Auto-generated method stub
		return null;
	}

	public Entreprise delete(Entreprise paramEntreprise) {
		// TODO Auto-generated method stub
		return null;
	}

	public Entreprise getById(Integer paramId) {
		return daoEntreprise.getById(paramId);
	}

	public List<Entreprise> getAll() {
		return daoEntreprise.getAll();
	}

	public List<Entreprise> getByMotCle(String paramMotCle) {
		return daoEntreprise.getByMotCle(paramMotCle);
	}

	public List<Entreprise> getByVille(Ville paramVille) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Entreprise> getEntrepriseByAdherent(Adherent paramAdherent) {
		// TODO Auto-generated method stub
		return null;
	}

}
