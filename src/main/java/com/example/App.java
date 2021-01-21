package com.example;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
	@PostConstruct
    public void init()
    {
        Logger log = LoggerFactory.getLogger(App.class);
        log.info("Java app starteddddd!!!!");
    }

	public String getStatus() {
		// TODO Auto-generated method stub
		return "OK";
	}

}
