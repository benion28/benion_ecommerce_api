package com.benion.benion_ecommerce_api.repositories;

import com.benion.benion_ecommerce_api.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}