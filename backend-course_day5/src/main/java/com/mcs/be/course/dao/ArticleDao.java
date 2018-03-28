package com.mcs.be.course.dao;

import com.mcs.be.course.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.lang.String;
import java.util.List;

@Repository
public interface ArticleDao extends JpaRepository<Article, Long> {
	
	List<Article> findByTitleContaining(String title);
	
}
