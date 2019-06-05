package com.myjetbrains.cronix.petclinic.repositories;

import com.myjetbrains.cronix.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
