package com.FRS.main.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FRS.main.dao.TacheReparationRepository;
import com.FRS.main.entities.Tache_Reparation;
@RestController
@RequestMapping("/Gesrep")
//@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
@Transactional
public class TacheReparationController {
@Autowired
TacheReparationRepository TRR;
@PostMapping(value="/TacheReparation",produces=MediaType.APPLICATION_JSON_VALUE)
	public Tache_Reparation Create(@RequestBody Tache_Reparation tacheReparation) {
		return TRR.save(tacheReparation);

	}
@DeleteMapping(value="/TacheReparation",produces=MediaType.APPLICATION_JSON_VALUE)
	public Boolean Delete(@PathVariable Long id_tacheReparation) {
		TRR.delete(id_tacheReparation);
		return true;
	}

	@PutMapping(value="/TacheReparation",produces=MediaType.APPLICATION_JSON_VALUE)
	public Tache_Reparation Update(@RequestBody Tache_Reparation tacheReparation) {
		return TRR.save(tacheReparation);
	}

	@GetMapping(value="/TacheReparation",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Tache_Reparation> GetTacheReparations() {
		return TRR.findAll();
	}

	@GetMapping(value="/TacheReparation/{id_tacheReparation}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Tache_Reparation GetTacheReparation(Long id_tacheReparation) {
		return TRR.findOne(id_tacheReparation);
	}

}
