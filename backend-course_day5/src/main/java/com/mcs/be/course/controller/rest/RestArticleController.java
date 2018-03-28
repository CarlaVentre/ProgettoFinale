package com.mcs.be.course.controller.rest;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mcs.be.course.dto.ArticleDto;
import com.mcs.be.course.exception.ElementNotFound;
import com.mcs.be.course.facade.ArticleFacade;
import com.mcs.be.course.model.Article;

//TODO add correct annotations
@RestController
@RequestMapping(value="/articles")
public class RestArticleController {

    private static final Logger LOGGER = LogManager.getLogger(RestArticleController.class);
    

    //TODO inject facade
    @Autowired
    private ArticleFacade articleFacade;

    //TODO create method that responds to /articles in GET and returning a list of ArticleDto
    @RequestMapping(method = RequestMethod.GET)
    public List<ArticleDto> getArticles(){
    	return articleFacade.retrieveAllArticles();
    }
    
    
    //TODO create method that responds to /articles/{id} in GET and returning a ArticleDto
    //espressione regolare CHE IDENTIFICHI UN INSIEME DI NUMERI, uso dell'annotazione PathParam, verifica che funzioni su postman(articles/:id)
    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ArticleDto retrieveArticleById(@PathVariable("id") Long id) throws ElementNotFound {
    	return articleFacade.retrieveArticleById(id);
    }
    
    @RequestMapping(value="/find", method= RequestMethod.GET)
    public List<ArticleDto>  retrieveArticleByTitle(@RequestParam ("by") String title) throws ElementNotFound{
    	return articleFacade.retrieveByTitle(title);
    }
    
    //TODO create method that responds to /articles/like in PATCH receiving a json like {"id" : 1} and returning a ArticleDto after updating his like value
    //RequestBody, cerca PathVariables per indicazione sul value, usare int 
    @RequestMapping(value ="/like", method = RequestMethod.PATCH)
    public ArticleDto addLikeArticle(@RequestBody ArticleDto a) throws ElementNotFound{
    	return articleFacade.addLikeToArticle(a.getId());
    }
    
    //creazione nuovo articolo
    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH})
    public ArticleDto createOrUpdateAssignment(@RequestBody ArticleDto assignmentDto) throws ElementNotFound {
    	return articleFacade.saveOrUpdate(assignmentDto);
    }
    
    
}
