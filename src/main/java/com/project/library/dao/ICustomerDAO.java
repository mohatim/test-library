package com.project.library.dao;

import com.project.library.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerDAO extends JpaRepository<Customer,Integer> {

    public Customer findCustomerByEmail(String email);

}
