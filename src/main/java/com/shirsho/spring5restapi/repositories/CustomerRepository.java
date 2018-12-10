package com.shirsho.spring5restapi.repositories;

import com.shirsho.spring5restapi.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
