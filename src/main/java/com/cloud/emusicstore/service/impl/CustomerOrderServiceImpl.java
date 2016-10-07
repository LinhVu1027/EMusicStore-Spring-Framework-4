package com.cloud.emusicstore.service.impl;

import com.cloud.emusicstore.dao.CartDao;
import com.cloud.emusicstore.dao.CustomerOrderDao;
import com.cloud.emusicstore.model.Cart;
import com.cloud.emusicstore.model.CartItem;
import com.cloud.emusicstore.model.CustomerOrder;
import com.cloud.emusicstore.service.CartService;
import com.cloud.emusicstore.service.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by AllenWalker on 10/4/16.
 */
@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {

    @Autowired
    private CartService cartService;

    @Autowired
    private CustomerOrderDao customerOrderDao;

    @Override
    public void addCustomerOrder(CustomerOrder customerOrder) {
        customerOrderDao.addCustomerOrder(customerOrder);
    }

    @Override
    public double getCustomerOrderGrandTotal(int cartId) {
        double grandTotal = 0;
        Cart cart = cartService.getCartById(cartId);
        List<CartItem> cartItems = cart.getCartItems();

        for (CartItem item : cartItems) {
            grandTotal += item.getTotalPrice();
        }

        return grandTotal;
    }
}
