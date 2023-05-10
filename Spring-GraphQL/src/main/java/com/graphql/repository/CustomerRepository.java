package com.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graphql.model.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
	Customer findCustomerByEmail(String email);
}
