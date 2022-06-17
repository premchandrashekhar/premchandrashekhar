package com.test.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.springboot.entity.Ticket;

@Repository
public interface TicketRepository extends CrudRepository<Ticket, Integer> {

}
