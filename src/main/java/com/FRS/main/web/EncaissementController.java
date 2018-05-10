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

import com.FRS.main.dao.EncaissementRepository;
import com.FRS.main.entities.Article;
import com.FRS.main.entities.Encaissement;
import com.FRS.main.dao.ArticleRepository;



@RestController
@RequestMapping("/Gesrep")
//@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
@Transactional
public class EncaissementController {
@Autowired
EncaissementRepository EncRep;
@Autowired
ArticleRepository ArticleRep;

@PostMapping(value="/Encaissement", produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
public Encaissement Create(@RequestBody Encaissement Enc) {
	return EncRep.save(Enc);
	}
@PutMapping(value="/Encaissement",produces=MediaType.APPLICATION_JSON_VALUE)
public Encaissement Update(@RequestBody Encaissement	Enc) {
	return EncRep.save(Enc);
	}
@GetMapping(value="/Encaissement/{Id_Encaissement}",produces=MediaType.APPLICATION_JSON_VALUE)
public Encaissement GetEnc(@PathVariable Long Id_Encaissement) {
	return EncRep.findOne(Id_Encaissement);
	}
@GetMapping(value="/Encaissement",produces=MediaType.APPLICATION_JSON_VALUE)
public List<Encaissement> GetEncs() {
	return EncRep.findAll();
	}
@DeleteMapping(value="/Encaissement/{Id_Encaissement}",produces=MediaType.APPLICATION_JSON_VALUE)
public Boolean Delete(@PathVariable Long Id_Encaissement) {
	EncRep.delete(Id_Encaissement);
	return true;
	}

}
