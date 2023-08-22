package com.example.demo;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public class articleservice {


	
	@Component
	@Service
	public class ArticleService {
		
	}
	    private ArrayList<article> articles=new ArrayList<Article>();
	    
	    public void init(){
	        Article a1=new Article(100.50, "Pantalon","pour femme");
	        articles.add(a1);
	        
	        Article a3=new Article(500.50, "tricot","pour homme");
	        articles.add(a3);
	        
	        Article a2=new Article(200.50, "chemise","pour fille");
	        articles.add(a2);
	    }
	    
	    void ajouterArtice(Article art){
	        articles.add(art);
	    }
	    
	    //trouver article on se basant sur id
	    public void modifierArticle(Article art){
	        /* a.setDescription(art.getDescription());
	                a.setNom(art.get);*/
	        Article ancien=null;
	        for (Article a:articles)
	        {
	            if(a.getId()==art.getId()){
	              ancien=a;
	              break;
	            }
	        }
	        // faire des modif
	        if(ancien!=null)
	        {
	            ancien.setDescription((art.getDescription()));
	            ancien.setNom(art.getNom());
	            ancien.setPrix(art.getPrix());
	        }

	    }

	    public ArrayList<Article> getArticles() {
	        return articles;
	    }
	    public void supprimerArticle(int id){
	       article suppr=null;
	        for (Article a:articles)
	        {
	            if(a.getId()==id){
	                suppr=a;
	                break;
	            }
	        }
	        if(suppr!=null){
	        articles.remove(suppr);
	    }}
	}