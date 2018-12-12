package com.shirsho.spring5restapi.services;

import com.shirsho.spring5restapi.domain.Customer;
import com.shirsho.spring5restapi.repositories.CustomerRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer findCustomerById(Long Id) {
        return customerRepository.findById(Id).get();
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer, Long Id) {
        Customer searchCustomer=customerRepository.findById(Id).get();
        searchCustomer.setFirstName(customer.getFirstName());
        searchCustomer.setLastName(customer.getLastName());
        return customerRepository.save(searchCustomer);
    }

    @Override
    public void deleteCustomer(Long Id) {

        Customer searchCustomer=customerRepository.findById(Id).get();
        customerRepository.delete(searchCustomer);
    }
}
