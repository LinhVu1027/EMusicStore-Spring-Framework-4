package com.cloud.emusicstore.service;

import com.cloud.emusicstore.model.Cart;

/**
 * Created by AllenWalker on 10/4/16.
 */
public interface CartService {

    Cart getCartById(int cartId);

    void update(Cart cart);
}
