/**
 * 
 */
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

import com.FRS.main.dao.ArticleRepository;
import com.FRS.main.entities.Article;

/**
 * @author imed 
 *
 */
@RestController
@RequestMapping("/Gesrep")
//@CrossOrigin(origins="*", allowedHeaders="*")
@Transactional
public class ArticleController {
	@Autowired
	ArticleRepository articleRepository;
	
	@PostMapping(value="/Article", produces=MediaType.APPLICATION_JSON_VALUE)
	public Article Create(@RequestBody Article article) {
		return articleRepository.save(article);
	}
	@PutMapping(value="/Article", produces=MediaType.APPLICATION_JSON_VALUE)
	public Article Update(@RequestBody Article article) {
		return articleRepository.save(article);
	}
	@GetMapping(value="/Article/{Id_Article}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Article GetArticle(@PathVariable Long Id_Article) {
		return articleRepository.findOne(Id_Article);
	}
	@GetMapping(value="/Article", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Article> GetArticles() {
		return articleRepository.findAll();
	}
	@DeleteMapping(value="/Article/{Id_Article}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Boolean Delete(@PathVariable Long Id_Article) {
		articleRepository.delete(Id_Article);
		return true;
	}
	
}
