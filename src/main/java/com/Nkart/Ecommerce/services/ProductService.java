package com.Nkart.Ecommerce.services;

import com.Nkart.Ecommerce.model.Product;

import java.util.List;

public interface ProductService {
    // add products
    Product addProduct(Product product);
    // get all product
    List<Product> getAllProduct();
    // get product by id
    Product getProductById(Long id);
    // update product
    Product updateProduct(Long id,Product product);
    // delete product
    void deleteProduct(Long id);
}
