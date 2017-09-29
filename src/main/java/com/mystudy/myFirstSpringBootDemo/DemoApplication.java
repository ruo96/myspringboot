package com.mystudy.myFirstSpringBootDemo;

import com.mystudy.myFirstSpringBootDemo.config.AuthorSettings;
import com.mystudy.myFirstSpringBootDemo.config.NewSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication  //这个是spring boot项目的核心注解，主要目的是开启自动配置。
public class DemoApplication {

	@Autowired
	private AuthorSettings authorSettings;

	@Autowired
	private NewSettings newSettings;

	@Value("${book.author}")
	private String bookAuthor;
	@Value("${book.name}")
	private String bookName;

	@RequestMapping("/")
	String index(){
		return "book name is : " + bookName +" and book author is : " + bookAuthor;
	}

	@RequestMapping("/1")
	String index1(){
		return "Hello Spring Boot : This is my first spring boot demo!";
	}

	@RequestMapping("/2")
	String index2(){
		return "author name is : " + authorSettings.getName() +" and author age is : " + authorSettings.getAge();
	}

	@RequestMapping("/3")
	String index3(){
		return "sex  is : " + newSettings.getSex();
	}


	/*这个是一个标准的java应用的main方法，主要作用是作为项目启动的入口。*/
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
