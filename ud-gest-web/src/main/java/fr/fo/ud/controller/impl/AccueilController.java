package fr.fo.ud.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.fo.ud.business.api.IBusinessAdherent;

@Controller
public class AccueilController {

	@Autowired
	IBusinessAdherent buAdherent;
	
	@RequestMapping(value="/accueil/{id}")
	public String accueil(Model model, @PathVariable(name="id") int id) {
		
		System.out.println("Dans le controller de accueil");
		System.out.println("test hot swap");
		try {
			model.addAttribute("adherent", buAdherent.getById(id));
			return "accueil";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		
	}
	
}
