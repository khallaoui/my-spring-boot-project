package com.domaine.exemple.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.domaine.exemple.metier.Article;
import com.domaine.exemple.metier.ArticleService;


@Controller
public class ArticleController {
	@Autowired
	private ArticleService service;
	
	@RequestMapping("/")
	public String afficherList(Model model) {
		ArrayList<Article> arts = service.getArticles();
		model.addAttribute("articles", arts);
		return "index" ;
	}
	
	@RequestMapping("/addArt")
	public ModelAndView addArt() {
		
		ModelAndView mv = new ModelAndView("ajouter");
		Article art = new Article();
		mv.addObject("article", art);
		return mv;
		
		
	}
}
