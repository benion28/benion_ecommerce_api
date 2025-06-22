package com.benion.benion_ecommerce_api.repositories;

import com.benion.benion_ecommerce_api.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Byte> {
}