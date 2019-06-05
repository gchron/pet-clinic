package com.myjetbrains.cronix.petclinic.repositories;

import com.myjetbrains.cronix.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
