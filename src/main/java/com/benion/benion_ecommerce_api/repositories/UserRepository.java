package com.benion.benion_ecommerce_api.repositories;

import com.benion.benion_ecommerce_api.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
