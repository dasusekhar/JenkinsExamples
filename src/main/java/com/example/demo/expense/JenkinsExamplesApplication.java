package com.example.demo.expense;

import javax.annotation.PostConstruct;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class JenkinsExamplesApplication {
	
public static org.slf4j.Logger logger=LoggerFactory.getLogger(JenkinsExamplesApplication.class);
@PostConstruct
public void intt()
{
	logger.info("application started");
}
	public static void main(String[] args) {
		logger.info("application executed");
		SpringApplication.run(JenkinsExamplesApplication.class, args);
	}

}
