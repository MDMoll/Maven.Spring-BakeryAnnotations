package com.zipcodewilmington.bakery.repositories;

import com.zipcodewilmington.bakery.models.Baker;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Entity;

public interface BakerRepository extends CrudRepository<Baker, Long> {
}
