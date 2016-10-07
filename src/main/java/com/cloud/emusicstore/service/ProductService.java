package com.cloud.emusicstore.service;

import com.cloud.emusicstore.model.Product;

import java.util.List;

/**
 * Created by AllenWalker on 10/3/16.
 */
public interface ProductService {

    List<Product> getProductList();

    Product getProductById(int id);

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product product);
}
