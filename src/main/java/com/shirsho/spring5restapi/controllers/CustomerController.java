package com.shirsho.spring5restapi.controllers;


import com.shirsho.spring5restapi.domain.Customer;
import com.shirsho.spring5restapi.services.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(CustomerController.BASE_URL)
public class CustomerController {

    public static final String BASE_URL = "/api/v1/customers";

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    List<Customer> getAllCustomers() {
        return customerService.findAllCustomers();
    }

    @GetMapping("/{Id}")
    public Customer getCustomerById(@PathVariable Long Id) {
        return customerService.findCustomerById(Id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer saveCustomer(Customer customer) {
        return customerService.saveCustomer(customer);
    }
}
