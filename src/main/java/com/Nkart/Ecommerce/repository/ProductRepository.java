package com.Nkart.Ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Nkart.Ecommerce.model.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
