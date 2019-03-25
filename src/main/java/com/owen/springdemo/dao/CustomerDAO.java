package com.owen.springdemo.dao;

import com.owen.springdemo.entity.Customer;

import java.util.List;

/**
 * @author yuchlin on 3/24/19
 */
public interface CustomerDAO {

    List<Customer> getCustomers();
}
