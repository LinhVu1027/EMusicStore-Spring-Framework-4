package com.cloud.emusicstore.dao;

import com.cloud.emusicstore.model.Cart;

import java.io.IOException;

/**
 * Created by AllenWalker on 9/29/16.
 */
public interface CartDao {

    Cart getCartById(int cartId);

    void update(Cart cart);

    Cart validate(int cartId) throws IOException;

}
