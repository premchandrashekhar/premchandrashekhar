package com.test.springboot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.springboot.entity.Application;
import com.test.springboot.exception.ApplicationNotFoundException;
import com.test.springboot.repository.ApplicationRepository;

@Service
public class ApplicationServiceImpl implements ApplicationService {
	
	@Autowired
	ApplicationRepository applicationRepository;

	@Override
	public Application getApplication(Long id) {
		Optional<Application> optionalApplication = applicationRepository.findById(id);
		if(optionalApplication.isPresent()) {
			return optionalApplication.get();
		}else
			throw new ApplicationNotFoundException("Application Not Found");
	}

}
