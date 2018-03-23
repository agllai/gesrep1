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


import com.FRS.main.dao.OperatorRepository;
import com.FRS.main.entities.Operateur;
@RestController
@RequestMapping("/Gesrep")
//@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
@Transactional
public class OperatorCotroller  {
@Autowired
OperatorRepository OpRep;
@PostMapping(value="/Operator",produces=MediaType.APPLICATION_JSON_VALUE)
	public Operateur Create(@RequestBody Operateur operateur) {
		return OpRep.save(operateur);

	}

@DeleteMapping(value="/Operator",produces=MediaType.APPLICATION_JSON_VALUE)
	public Boolean Delete(@PathVariable Long id_operateur) {
		OpRep.delete(id_operateur);
		return true;
	}

	@PutMapping(value="/Operator",produces=MediaType.APPLICATION_JSON_VALUE)
	public Operateur Update(@RequestBody Operateur operateur) {
		return OpRep.save(operateur);

	}

	@GetMapping(value="/Operator",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Operateur> GetOperators() {
		
		return OpRep.findAll();
	}

	@GetMapping(value="/Operator/{id_opertor}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Operateur GetOperator(@PathVariable Long id_operateur) {
		return OpRep.findOne(id_operateur);
	}

}
