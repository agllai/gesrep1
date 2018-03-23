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

import com.FRS.main.dao.Demande_ReparationRepository;
import com.FRS.main.entities.Demande_Reparation;
@RestController
@RequestMapping("/Gesrep")
//@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
@Transactional
public class DemandeReparationController  {
	@Autowired
Demande_ReparationRepository demandereparationRepository;
	@PostMapping(value="/DemandeReparartion", produces=MediaType.APPLICATION_JSON_VALUE)
	public Demande_Reparation Create(@RequestBody Demande_Reparation demandeReparation) {
	return	demandereparationRepository.save(demandeReparation);

	}

@DeleteMapping(value="/DemandeReparation", produces=MediaType.APPLICATION_JSON_VALUE)
	public Boolean Delete(@PathVariable Long id_demandeReparation) {
		demandereparationRepository.delete(id_demandeReparation);
		return true;
	}
@PutMapping(value="/DemandeReparation", produces=MediaType.APPLICATION_JSON_VALUE)
	public Demande_Reparation Update(@RequestBody Demande_Reparation demandeReparation) {
	
	return	demandereparationRepository.save(demandeReparation);

	}

@GetMapping(value="/DemandeReparation", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Demande_Reparation> GetDemandeReparations() {

		return demandereparationRepository.findAll();
	}

@GetMapping(value="/DemandeReparation/{DRid}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Demande_Reparation GetDemandeReparation(@PathVariable Long DRid) {
		
		return demandereparationRepository.findOne(DRid);
	}

}
