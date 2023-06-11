package com.project.library.services.impl;

import com.project.library.dao.ICustomerDAO;
import com.project.library.entities.Book;
import com.project.library.entities.Customer;
import com.project.library.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private ICustomerDAO customerDAO;

    @Override
    public Customer findCustomerByEmail(String email) {
        return customerDAO.findCustomerByEmail(email);
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerDAO.save(customer);
    }

    @Override
    public boolean checkIfIdExists(Integer id) {
        return customerDAO.existsById(id);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customerDAO.save(customer);
    }

    @Override
    public void deleteCustomer(Integer customerId) {
        customerDAO.deleteById(customerId);
    }

    @Override
    public List<Customer> findCustomerByLastName(String lastName) {
        return findCustomerByLastName(lastName);
    }
}
