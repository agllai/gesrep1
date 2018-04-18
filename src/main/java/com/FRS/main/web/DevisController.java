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

import com.FRS.main.dao.DevisRepository;
import com.FRS.main.entities.Devis;
@RestController
@RequestMapping("/Gesrep")
//@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
@Transactional
public class DevisController  {
	@Autowired
DevisRepository devisRepository;
	@PostMapping(value="/Devis", produces=MediaType.APPLICATION_JSON_VALUE)
	public Devis Create(@RequestBody Devis devis) {
		return devisRepository.save(devis);
	}

	@DeleteMapping(value="/Devis/{id_devis}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Boolean DeleteDevis(@PathVariable Long id_devis) {
		devisRepository.delete(id_devis);
		return true;
	}
	@PutMapping(value="/Devis", produces=MediaType.APPLICATION_JSON_VALUE)
	public void Update(@RequestBody Devis devis) {
	
		devisRepository.save(devis);
	}

	@GetMapping(value="/Devis", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Devis> ListerDevis() {
		
		return devisRepository.findAll();
	}

	@GetMapping(value="/Devis/{id_devis}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Devis FindDevis(@PathVariable Long id_devis) {
		
		return devisRepository.findOne(id_devis);
	}

}
