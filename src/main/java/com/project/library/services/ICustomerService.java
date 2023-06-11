package com.project.library.services;

import com.project.library.entities.Book;
import com.project.library.entities.Customer;

import java.util.List;

public interface ICustomerService {

    public Customer findCustomerByEmail(String email);

    public Customer saveCustomer(Customer customer);

    public boolean checkIfIdExists(Integer id);

    public Customer updateCustomer(Customer customer);

    public void deleteCustomer(Integer customerId);

    public List<Customer> findCustomerByLastName(String lastName);
}
