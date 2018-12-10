package com.shirsho.spring5restapi.bootstrap;

import com.shirsho.spring5restapi.domain.Customer;
import com.shirsho.spring5restapi.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {


    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        Customer customer1=new Customer();
        customer1.setFirstName("Harry");
        customer1.setLastName("Potter");

        customerRepository.save(customer1);

        Customer customer2=new Customer();
        customer2.setFirstName("Newt");
        customer2.setLastName("Scamander");

        customerRepository.save(customer2);

        Customer customer3=new Customer();
        customer3.setFirstName("Scorpius");
        customer3.setLastName("Malfoy");

        customerRepository.save(customer3);

        System.out.println("Count of customers"+customerRepository.count());





    }
}
