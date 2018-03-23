package com.FRS.main.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FRS.main.dao.EtatRepository;
import com.FRS.main.entities.Etat;
@RestController
@RequestMapping("/Gesrep")
//@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
@Transactional
public class EtatController {
@Autowired
EtatRepository ERep;
	@GetMapping(value="/Etat",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Etat> GetEtats() {
		return ERep.findAll();
	}

	@GetMapping(value="/Etat/{id_Etat}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Etat GetEtat(@PathVariable Long id_Etat) {
		
		return ERep.findOne(id_Etat);
	}

}
