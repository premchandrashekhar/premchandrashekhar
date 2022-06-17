package com.test.springboot;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.test.springboot.entity.Application;
import com.test.springboot.repository.ApplicationRepository;


@SpringBootApplication
public class SpringbootApplication {
	
	private static final Logger log = LoggerFactory.getLogger(SpringbootApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(ApplicationRepository repository) {
		return (args) -> {
			repository.save(new Application("Sonu-1","Test 1","Prem-1"));
			repository.save(new Application("Sonu-2","Test 2","Prem-2"));
			repository.save(new Application("Sonu-3","Test 3","Prem-3"));
			
			for(Application app : repository.findAll()) {
				log.info("The Application is : "+app.toString());
			}
		};
	}

}
