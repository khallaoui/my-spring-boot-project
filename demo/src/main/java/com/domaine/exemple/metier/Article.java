package com.domaine.exemple.metier;

public class Article {

	
	private int id ;
	private String nom ;
	private String description ;
	private double prix ;
	private static int cnt = 0 ;
	
	
	public Article(String nom, String description, double prix) {
		this.id = ++cnt;
		this.nom = nom;
		this.description = description;
		this.prix = prix;
	}
	
	public Article() {
		this.id = ++cnt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public static int getCnt() {
		return cnt;
	}

	public static void setCnt(int cnt) {
		Article.cnt = cnt;
	}
	
	
	
	
}


