package com.docker.testingDocker;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class TestingDockerApplication {

	public static Logger logger= Logger.getLogger(TestingDockerApplication.class.getName());

	@PostConstruct
	public  void init(){
		logger.info("application started....");
	}
	public static void main(String[] args) {
		logger.info("application excuted....");
		SpringApplication.run(TestingDockerApplication.class, args);
	}

}
