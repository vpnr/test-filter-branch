package fr.fo.ud.business.impl;

import java.util.List;

import fr.fo.ud.business.api.IBusinessVille;
import fr.fo.ud.data.api.IDaoVille;
import fr.fo.ud.entity.Ville;

public class BusinessVille implements IBusinessVille{

	private IDaoVille daoVille;
	
	public List<Ville> getAll() {
		List<Ville> villes = null;
		villes = daoVille.getAll();
		return villes;
	}

	public List<Ville> getByMotCle(String paramMotCle) {
		// TODO Auto-generated method stub
		return null;
	}

	public Ville getById(Integer paramId) {
	    return daoVille.getById(paramId);
	}

	public List<Ville> getByCodePostal(String paramCp) {
		List<Ville> villes = null;
		villes = daoVille.getByCodePostal(paramCp);
		return villes;
	}
	
}
