package com.myjetbrains.cronix.petclinic.repositories;

import com.myjetbrains.cronix.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
