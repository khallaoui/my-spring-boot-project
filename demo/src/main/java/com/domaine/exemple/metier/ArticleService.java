package com.domaine.exemple.metier;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
@Component
public class ArticleService {
	Article old;
	Article supp;
	
	private ArrayList<Article> articles = new ArrayList<Article>();

	public void  init() {
		Article al = new Article("Pantalon", "Pour femme", 100.50);
		articles.add(al);
		Article a2 = new Article("Jean", "Pour homme", 32);
		articles.add(a2);
		Article a3 = new Article("Spadrille", "Pour femme", 39);
		articles.add(a3);
		Article a4 = new Article("Spadrille", "Pour homme", 43);
		articles.add(a4);
		
	}
	
	
	public void ajouterArticle(Article art) {
		articles.add(art);
	}
	
	public void modifierArticle(Article art) {
		for (Article a : articles) {
			if(a.getId() == art.getId()) {
				Article old = a;
				break;
			}
		}
		
		if(old != null) {
			old.setDescription(art.getDescription());
			old.setNom(art.getNom());
			old.setPrix(art.getPrix());
		}
	}
	
	public ArrayList<Article> getArticles(){
		return articles;
	}
	
	
	public void supprimerArticle(int id) {
		for (Article a : articles) {
			if(a.getId() == id) {
				 supp = a;
				break;
			}
		}
		if(supp != null) {
			articles.remove(supp);
		}
		
		
	}
	
}
