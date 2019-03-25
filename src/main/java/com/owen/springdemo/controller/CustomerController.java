package com.owen.springdemo.controller;

import com.owen.springdemo.dao.CustomerDAO;
import com.owen.springdemo.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	// need to inject customer DAO
	@Autowired
	private CustomerDAO customerDAO;

	@RequestMapping("/list")
	public String listCustomers(Model theModel) {

		// get customers from the dao
		List<Customer> customers = customerDAO.getCustomers();

		// add the customers to model
		theModel.addAttribute("customers", customers);
		
		return "list-customers";
	}
	
}


