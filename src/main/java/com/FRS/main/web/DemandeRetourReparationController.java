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

import com.FRS.main.dao.DemandeRetourRepRepository;
import com.FRS.main.entities.Demande_Retour_Reparation;
@RestController
@RequestMapping("/Gesrep")
//@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
@Transactional
public class DemandeRetourReparationController {
	@Autowired
DemandeRetourRepRepository demandeRetourRepRepository; 
	@PostMapping(value="/DemandeRetourReparation", produces=MediaType.APPLICATION_JSON_VALUE)
	public  Demande_Retour_Reparation Create(@RequestBody Demande_Retour_Reparation demande_retour_reparation) {
		return demandeRetourRepRepository.save(demande_retour_reparation);
	}

	@DeleteMapping(value="/DemandeRetourReparation/{DRRid}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Boolean DeleteDemandeRetourReparation(@PathVariable Long DRRid) {
		 demandeRetourRepRepository.delete(DRRid);
        return true;
	
	}

	@PutMapping(value="/DemandeRetourReparation", produces=MediaType.APPLICATION_JSON_VALUE)
	public Demande_Retour_Reparation Update(@RequestBody Demande_Retour_Reparation DRR) {
	
	return	demandeRetourRepRepository.save(DRR);
	}

	@GetMapping(value="/DemandeRetourReparation", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Demande_Retour_Reparation> GetDemandeRetourReparations() {
		return demandeRetourRepRepository.findAll();
	}

	@GetMapping(value="/DemandeRetourReparation/{DRRid}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Demande_Retour_Reparation GetDemandeRetourReparation(@PathVariable Long DRRid) {
	
		return demandeRetourRepRepository.findOne(DRRid);
	}

}
