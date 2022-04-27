package com.codegym.customer.service.impl;

import com.codegym.customer.model.Countries;
import com.codegym.customer.model.Customer;
import com.codegym.customer.model.CustomerType;
import com.codegym.customer.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Override
    public Page<Customer> findAllCustomer(Pageable pageable) {
        return null;
    }

    @Override
    public void deleteCustomer() {

    }

    @Override
    public List<Customer> searchCustomer(String name, String email, String phone, String address, Integer point, Countries countries, CustomerType customerType) {
        return null;
    }
}
