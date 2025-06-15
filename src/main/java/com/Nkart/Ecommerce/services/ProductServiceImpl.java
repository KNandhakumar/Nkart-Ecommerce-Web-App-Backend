package com.Nkart.Ecommerce.services;

import com.Nkart.Ecommerce.model.Product;
import com.Nkart.Ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    // add letter
    public Product addProduct(Product product){
        return productRepository.save(product);
    }
    // get all products
    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }
    // get single products using id
    public Product getProductById(Long id){
        return productRepository.findById(id).orElse(null);
    }
    // delete product
    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }
}
