package com.codegym.customer.service;

import com.codegym.customer.model.Countries;
import com.codegym.customer.model.Customer;
import com.codegym.customer.model.CustomerType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICustomerService {
    Page<Customer> findAllCustomer(Pageable pageable);

    void deleteCustomer();

    List<Customer> searchCustomer(String name, String email, String phone, String address, Integer point, Countries countries, CustomerType customerType);
}
