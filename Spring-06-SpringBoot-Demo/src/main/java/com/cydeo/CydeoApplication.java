package com.cydeo;

import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//Component scan
//Provides configuration class
//Enable auto-configuration
@SpringBootApplication
public class CydeoApplication {

	public static void main(String[] args) {
		Comment comment = new Comment();
		comment.setAuthor("Johnson");
		comment.setText("Spring Framework");

		ConfigurableApplicationContext context = SpringApplication.run(CydeoApplication.class, args);

		CommentService cs = context.getBean(CommentService.class);
		cs.publishComment(comment);
	}


}
