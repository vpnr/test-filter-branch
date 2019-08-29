package fr.fo.ud.entity;

import java.io.Serializable;

public class AssociationFonctionId implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idAdherent;
	
	private Integer idFonction;

	@Override
	public int hashCode() {
		return idAdherent + idFonction;
	}
	
}
