package com.cloud.emusicstore.service;

import com.cloud.emusicstore.model.Customer;

import java.util.List;

/**
 * Created by AllenWalker on 10/3/16.
 */
public interface CustomerService {

    List<Customer> getAllCustomers();

    Customer getCustomerById(int id);

    void addCustomer(Customer customer);

    Customer getCustomerByUsername(String username);
}
