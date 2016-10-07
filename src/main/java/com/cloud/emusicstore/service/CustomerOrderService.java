package com.cloud.emusicstore.service;

import com.cloud.emusicstore.model.CustomerOrder;

/**
 * Created by AllenWalker on 10/4/16.
 */
public interface CustomerOrderService {

    void addCustomerOrder(CustomerOrder customerOrder);

    double getCustomerOrderGrandTotal(int cartId);
}
