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

import com.FRS.main.dao.Bon_ReparationRepository;
import com.FRS.main.entities.Bon_Reparation;
@RestController
@RequestMapping("/Gesrep")
//@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
@Transactional
public class BonReparationController {
	@Autowired
public Bon_ReparationRepository bonReparationRepository;
	
	@PostMapping(value="/BonReparation", produces=MediaType.APPLICATION_JSON_VALUE)
	public Bon_Reparation Create(@RequestBody Bon_Reparation bonReparation) {
	return	bonReparationRepository.save(bonReparation);
	}
	
	@DeleteMapping(value="/BonReparation/{id_bonReparation}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Boolean Delete(@PathVariable Long id_bonReparation) {
		bonReparationRepository.delete(id_bonReparation);
		return true;
	}
	
	@PutMapping(value="/BonReparation", produces=MediaType.APPLICATION_JSON_VALUE)
	public Bon_Reparation Update(@RequestBody Bon_Reparation bonReparation) {
	return	bonReparationRepository.save(bonReparation);
	}
	
	@GetMapping(value="/BonReparation", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Bon_Reparation> GetBonReparation() {	
		return bonReparationRepository.findAll();
	}

	@GetMapping(value="/BonReparation/{id_bonReparation}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Bon_Reparation GetBonReparation(@PathVariable Long id_bonReparation) {
		return bonReparationRepository.findOne(id_bonReparation);
	}

}
