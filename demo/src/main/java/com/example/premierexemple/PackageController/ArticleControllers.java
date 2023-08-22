package com.example.premierexemple.PackageController;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.articleservice.ArticleService;

import ch.qos.logback.core.model.Model;

@Controller

public class ArticleControllers {
	
    @Autowired
    
    private ArticleService articleService;
    
//methode qui affiche la liste articles
    
    @RequestMapping("/")
    
    public String afficherListe(Model model){
    	
        //recuperer liste article
    	
        ArrayList<article> arts=ArticleService.getArticles();
        
        model.addAttribute("Articleliste",arts);
        
        return "index";
    }
}