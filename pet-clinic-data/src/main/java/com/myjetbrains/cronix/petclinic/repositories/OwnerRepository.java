package com.myjetbrains.cronix.petclinic.repositories;

import com.myjetbrains.cronix.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
