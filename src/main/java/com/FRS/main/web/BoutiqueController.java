package com.FRS.main.web;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.FRS.main.dao.BoutiqueRepository;
import com.FRS.main.entities.Boutique;



	@RestController
	@RequestMapping("/Gesrep")
//	@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
	@Transactional
	public class BoutiqueController {
	@Autowired
	BoutiqueRepository boutiqueRep;
	@PostMapping(value="/Boutique", produces=MediaType.APPLICATION_JSON_VALUE)
	public Boutique Create(@RequestBody Boutique boutique) {
		return boutiqueRep.save(boutique);
	}
	@PutMapping(value="/Boutique", produces=MediaType.APPLICATION_JSON_VALUE)
	public Boutique Update(@RequestBody Boutique	boutique) {
		return boutiqueRep.save(boutique);
	}
	@GetMapping(value="/Boutique/{Id_Boutique}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Boutique GetBoutique(@PathVariable Long Id_Boutique) {
		return boutiqueRep.findOne(Id_Boutique);
	}
	@GetMapping(value="/Boutique/", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Boutique> GetBoutiques() {
		return boutiqueRep.findAll();
	}
	@DeleteMapping(value="/Boutique/{Id_Boutique}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Boolean Delete(@PathVariable Long Id_Boutique) {
		boutiqueRep.delete(Id_Boutique);
		return true;
	}

	

}
