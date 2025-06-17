package com.Nkart.Ecommerce.controller;

import com.Nkart.Ecommerce.model.Product;
import com.Nkart.Ecommerce.services.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;
    // add products
    @PostMapping
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }
    // get all products
    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProduct();
    }
    // get single product using id
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id){
        return productService.getProductById(id);
    }
    // update product
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id,Product updateProduct){
        return productService.updateProduct(id,updateProduct);
    }
    // delete product
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }
}
