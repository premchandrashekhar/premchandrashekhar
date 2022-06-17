package com.test.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.springboot.entity.Release;

@Repository
public interface ReleaseRepository extends CrudRepository<Release, Integer> {

}
