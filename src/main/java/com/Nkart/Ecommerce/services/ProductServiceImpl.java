package com.Nkart.Ecommerce.services;

import com.Nkart.Ecommerce.model.Product;
import com.Nkart.Ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
import java.util.Optional;

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
    // update product
    public Product updateProduct(Long id,Product updatedProduct){
        Optional<Product> existing = productRepository.findById(id);
        if (existing.isPresent()){
            Product product = existing.get();
            product.setName(updatedProduct.getName());
            product.setDescription(updatedProduct.getDescription());
            product.setPrice(updatedProduct.getPrice());
            product.setImageUrl(updatedProduct.getImageUrl());
            return productRepository.save(product);
        }
        return null;
    }
    // delete product
    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }
}
