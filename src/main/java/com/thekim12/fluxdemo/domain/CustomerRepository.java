package com.thekim12.fluxdemo.domain;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface CustomerRepository extends ReactiveCrudRepository<Customer, Long> {

    @Query("select * from customer where last_name = :last_name")
    Flux<Customer> findByLastName(String lastName);
}
