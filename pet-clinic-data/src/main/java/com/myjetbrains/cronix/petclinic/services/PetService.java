package com.myjetbrains.cronix.petclinic.services;

import com.myjetbrains.cronix.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
