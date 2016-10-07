package com.cloud.emusicstore.service;

import com.cloud.emusicstore.model.Cart;
import com.cloud.emusicstore.model.CartItem;

/**
 * Created by AllenWalker on 10/4/16.
 */
public interface CartItemService {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByProductId(int productId);
}
