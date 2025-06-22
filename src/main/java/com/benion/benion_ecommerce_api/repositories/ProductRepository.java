package com.benion.benion_ecommerce_api.repositories;

import com.benion.benion_ecommerce_api.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}