package com.benion.benion_ecommerce_api.repositories;

import com.benion.benion_ecommerce_api.entities.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
}