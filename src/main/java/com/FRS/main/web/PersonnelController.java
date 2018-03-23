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

import com.FRS.main.dao.PersonnelRepository;
import com.FRS.main.entities.Personnel;
@RestController
@RequestMapping("/Gesrep")
//@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
@Transactional
public class PersonnelController{
private static final Boolean True = null;
@Autowired
PersonnelRepository PerRep;
	
	@PostMapping(value="/Personnel",produces=MediaType.APPLICATION_JSON_VALUE)
	public Personnel Create(@RequestBody Personnel personnel) {
	return PerRep.save(personnel);

	}
@DeleteMapping(value="/Personnel/{id_personnel}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Boolean Delete(@PathVariable Long id_personnel) {
PerRep.delete(id_personnel);
		return True;
	}

@PutMapping(value="/Personnel",produces=MediaType.APPLICATION_JSON_VALUE)
	public Personnel Update(@RequestBody Personnel personnel) {
return PerRep.save(personnel);

	}

@GetMapping(value="/Personnel",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Personnel> GetPersonnels() {

		return PerRep.findAll();
	}

@GetMapping(value="/Personnel/{id_personnel}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Personnel GetPersonnel(@PathVariable Long id_personnel) {
	
		return PerRep.findOne(id_personnel);
	}

}
