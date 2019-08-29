package fr.fo.ud.entity;

import java.io.Serializable;

public class AssociationFormationId implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idAdherent;
	
	private Integer idFormation;

	@Override
	public int hashCode() {
		return idAdherent + idFormation;
	}
}
