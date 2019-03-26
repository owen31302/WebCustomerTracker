package com.owen.springdemo.service;

import com.owen.springdemo.entity.Customer;

import java.util.List;

/**
 * @author yuchlin on 3/25/19
 */
public interface CustomerService {

    List<Customer> getCustomers();

    void saveCustomer(Customer customer);
}
