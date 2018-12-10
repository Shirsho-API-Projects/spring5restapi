package com.shirsho.spring5restapi.services;

import com.shirsho.spring5restapi.domain.Customer;

import java.util.List;

public interface CustomerService {

    Customer findCustomerById(Long Id);

    List<Customer> findAllCustomers();


    Customer saveCustomer(Customer customer);
}
