package com.test.springboot.mutator;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.springboot.entity.Application;
import com.test.springboot.exception.ApplicationNotFoundException;
import com.test.springboot.repository.ApplicationRepository;

/*@Component*/
public class Mutation /* implements GraphQLMutationResolver */ {

	@Autowired
	private ApplicationRepository applicationRepository;

	public Mutation(ApplicationRepository applicationRepository) {
		this.applicationRepository = applicationRepository;
	}

	public Application newApplication(String name, String owner, String description) {
		Application app = new Application(name, description, owner);
		applicationRepository.save(app);

		return app;
	}

	public boolean deleteApplication(long id) {
		applicationRepository.deleteById(id);
		return true;
	}

	public Application updateApplicationOwner(String newOwner, long id) {
		Optional<Application> findById = applicationRepository.findById(id);
		if (findById.isPresent()) {
			Application app = findById.get();
			app.setOwner(newOwner);
			applicationRepository.save(app);
			return app;
		} else {
			throw new ApplicationNotFoundException("Application Not Found", id);
		}

	}
}
