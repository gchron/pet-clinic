package com.myjetbrains.cronix.petclinic.services;

import com.myjetbrains.cronix.petclinic.model.PetType;
import org.springframework.stereotype.Service;

@Service
public interface PetTypeService extends  CrudService<PetType, Long> {

}
