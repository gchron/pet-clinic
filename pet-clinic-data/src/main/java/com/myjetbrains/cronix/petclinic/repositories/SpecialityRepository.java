package com.myjetbrains.cronix.petclinic.repositories;

import com.myjetbrains.cronix.petclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
