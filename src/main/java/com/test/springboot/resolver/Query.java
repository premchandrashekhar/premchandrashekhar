package com.test.springboot.resolver;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.springboot.entity.Application;
import com.test.springboot.repository.ApplicationRepository;

/*@Component*/
public class Query /* implements GraphQLQueryResolver */ {

	// public Query(Application application)

	@Autowired
	private ApplicationRepository applicationRepository;

	public Query(ApplicationRepository applicationRepository) {
		this.applicationRepository = applicationRepository;
	}

	public Iterable<Application> findAllApplication() {
		return applicationRepository.findAll();
	}

	public long countApplication() {
		return applicationRepository.count();
	}

}
