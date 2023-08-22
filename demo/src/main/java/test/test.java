package test;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;

import com.example.demo.articleservice;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = 
				SpringApplication.run(test.class, args);
		articleservice service = context.getBean(articleservice.class);
		service.init();

	}

}
