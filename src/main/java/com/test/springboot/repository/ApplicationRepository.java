package com.test.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.springboot.entity.Application;

@Repository
public interface ApplicationRepository extends CrudRepository<Application, Long> {

}
