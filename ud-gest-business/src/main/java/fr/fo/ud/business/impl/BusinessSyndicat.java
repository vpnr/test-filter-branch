package fr.fo.ud.business.impl;

import java.util.List;

import fr.fo.ud.business.api.IBusinessSyndicat;
import fr.fo.ud.data.api.IDaoSyndicat;
import fr.fo.ud.entity.Syndicat;
import fr.fo.ud.entity.Ville;

public class BusinessSyndicat implements IBusinessSyndicat{

	private IDaoSyndicat daoSyndicat;

	public Syndicat add(Syndicat paramSyndicat) {
	    return daoSyndicat.add(paramSyndicat);
	}

	public Syndicat update(Syndicat paramSyndicat) {
	    return daoSyndicat.update(paramSyndicat);
	}

	public Syndicat delete(Syndicat paramSyndicat) {
	    return daoSyndicat.delete(paramSyndicat);
	}

	public List<Syndicat> getAll() {
	    return daoSyndicat.getAll();
	}

	public Syndicat getById(Integer paramId) {
	    return daoSyndicat.getById(paramId);
	}

	public List<Syndicat> getByMotCle(String paramMotCle) {
	    return daoSyndicat.getByMotCle(paramMotCle);
	}

	public List<Syndicat> getByVille(Ville paramVille) {
		// TODO Auto-generated method stub
		return null;
	}
}
