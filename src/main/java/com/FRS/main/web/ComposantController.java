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

import com.FRS.main.dao.ComposantRepository;
import com.FRS.main.entities.Composant;
@RestController
@RequestMapping("/Gesrep")
//@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
@Transactional
public class ComposantController {
@Autowired
ComposantRepository CompRep;
@PostMapping(value="/Composant", produces=MediaType.APPLICATION_JSON_VALUE)
public Composant CreateArticle(@RequestBody Composant comp) {
	return CompRep.save(comp);
}
@PutMapping(value="/Composant", produces=MediaType.APPLICATION_JSON_VALUE)
public Composant UpdateArticle(@RequestBody Composant comp) {
	return CompRep.save(comp);
}
@GetMapping(value="/Composant/{Id_Composant}", produces=MediaType.APPLICATION_JSON_VALUE)
public Composant GetArticle(@PathVariable Long Id_Composant) {
	return CompRep.findOne(Id_Composant);
}
@GetMapping(value="/Composant/", produces=MediaType.APPLICATION_JSON_VALUE)
public List<Composant> GetArticles() {
	return CompRep.findAll();
}
@DeleteMapping(value="/Composant/{Id_Composant}", produces=MediaType.APPLICATION_JSON_VALUE)
public Boolean Delete(@PathVariable Long Id_Composant) {
	CompRep.delete(Id_Composant);
	return true;
}

}


