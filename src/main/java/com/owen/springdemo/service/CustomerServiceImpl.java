package com.owen.springdemo.service;

import com.owen.springdemo.dao.CustomerDAO;
import com.owen.springdemo.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author yuchlin on 3/25/19
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    // need to inject customer DAO
    @Autowired
    private CustomerDAO customerDAO;

    @Override
    @Transactional // Add this annotation, spring will start and end transaction for us
    public List<Customer> getCustomers() {
        return customerDAO.getCustomers();
    }
}
