package com.cloud.emusicstore.service.impl;

import com.cloud.emusicstore.dao.CartDao;
import com.cloud.emusicstore.model.Cart;
import com.cloud.emusicstore.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by AllenWalker on 10/4/16.
 */
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartDao cartDao;

    @Override
    public Cart getCartById(int cartId) {
        return cartDao.getCartById(cartId);
    }

    @Override
    public void update(Cart cart) {
        cartDao.update(cart);
    }
}
