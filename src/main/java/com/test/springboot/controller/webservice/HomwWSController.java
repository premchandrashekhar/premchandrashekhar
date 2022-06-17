package com.test.springboot.controller.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.test.springboot.entity.Application;
import com.test.springboot.exception.ApplicationNotFoundException;
import com.test.springboot.service.ApplicationService;

@RestController
public class HomwWSController {

	@Autowired
	private ApplicationService applicationService;
	
	public HomwWSController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/application/{id}")
	public ResponseEntity<Application> getApplication(@PathVariable("id") long id){
		
		try {
			return new ResponseEntity<Application>(applicationService.getApplication(id), HttpStatus.OK);
		} catch (ApplicationNotFoundException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Application Not Found");
		}
	}

}
