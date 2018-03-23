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
import com.FRS.main.dao.TypePanneRepository;
import com.FRS.main.entities.Type_Panne;
@RestController
@RequestMapping("/Gesrep")
//@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
@Transactional
public class TypePanneController{
@Autowired
TypePanneRepository TPRep;

	@PostMapping(value="/TypePanne",produces=MediaType.APPLICATION_JSON_VALUE)
	public Type_Panne Create(@RequestBody Type_Panne typePanne) {
		return TPRep.save(typePanne);
	}

	@DeleteMapping(value="/TypePanne/{id_typePanne}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Boolean Delete(@PathVariable Long id_typePanne) {
		TPRep.delete(id_typePanne);
		return true;
	}
@PutMapping(value="/TypePanne",produces=MediaType.APPLICATION_JSON_VALUE)
	public Type_Panne Update(@RequestBody Type_Panne typePanne) {
		return TPRep.save(typePanne);
		
	}

	@GetMapping(value="/TypePanne",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Type_Panne> GetTypePannes() {
		return TPRep.findAll();
	}

	@GetMapping(value="/TypePanne/{id_typePanne}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Type_Panne GetTypePanne(@PathVariable Long id_typePanne) {
		
		return TPRep.findOne(id_typePanne);
	}

}
