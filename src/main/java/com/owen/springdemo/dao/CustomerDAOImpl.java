package com.owen.springdemo.dao;

import com.owen.springdemo.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author yuchlin on 3/24/19
 */
@Repository // Add this annotation, and spring will handle uncatched exception for us
public class CustomerDAOImpl implements CustomerDAO{

    // Inject session factory, it was specified in spring-mvc-crud-demo-servlet.xml
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Customer> getCustomers() {

        // Get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // Create query
        Query<Customer> query = currentSession.createQuery("from Customer", Customer.class);

        // Execute query and get result list
        List<Customer> customers = query.getResultList();

        // return result
        return customers;
    }
}
