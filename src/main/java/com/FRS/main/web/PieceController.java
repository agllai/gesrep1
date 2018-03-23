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

import com.FRS.main.dao.PieceRepository;
import com.FRS.main.entities.Piece;

@RestController
@RequestMapping("/Gesrep")
//@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
@Transactional
public class PieceController {
@Autowired
PieceRepository pieceRep;
@PostMapping(value="/Piece",produces=MediaType.APPLICATION_JSON_VALUE)
public Piece CreateArticle(@RequestBody Piece	piece) {
	return pieceRep.save(piece);
}
@PutMapping(value="/Piece",produces=MediaType.APPLICATION_JSON_VALUE)
public Piece UpdateArticle(@RequestBody Piece	piece) {
	return pieceRep.save(piece);
}
@GetMapping(value="/Piece/{Id_Piece}",produces=MediaType.APPLICATION_JSON_VALUE)
public Piece GetArticle(@PathVariable Long Id_Piece) {
	return pieceRep.findOne(Id_Piece);
}
@GetMapping(value="/Piece/",produces=MediaType.APPLICATION_JSON_VALUE)
public List<Piece> GetArticles() {
	return pieceRep.findAll();
}
@DeleteMapping(value="/Piece/{Id_Piece}",produces=MediaType.APPLICATION_JSON_VALUE)
public Boolean Delete(@PathVariable Long Id_Piece) {
	pieceRep.delete(Id_Piece);
	return true;
}

}
