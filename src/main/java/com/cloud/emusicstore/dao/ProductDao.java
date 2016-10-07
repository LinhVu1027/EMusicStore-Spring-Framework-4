package com.cloud.emusicstore.dao;

import com.cloud.emusicstore.model.Product;

import java.util.List;

/**
 * Created by AllenWalker on 9/26/16.
 */
public interface ProductDao {

    List<Product> getProductList();

    Product getProductById(int id);

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product product);
}
