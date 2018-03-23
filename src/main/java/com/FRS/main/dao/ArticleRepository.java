package com.FRS.main.dao;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FRS.main.entities.Article;

public interface ArticleRepository  extends JpaRepository<Article, Long>{
	
}
