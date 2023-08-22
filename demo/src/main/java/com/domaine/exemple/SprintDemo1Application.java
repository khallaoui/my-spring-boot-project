package com.domaine.exemple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.domaine.exemple.metier.ArticleService;

@SpringBootApplication
public class SprintDemo1Application {

	public static void main(String[] args) {
		
		
		
		ApplicationContext context =  SpringApplication.run(SprintDemo1Application.class, args);
	
		ArticleService service = context.getBean(ArticleService.class);
		
		service.init();
		
	}
	

}
