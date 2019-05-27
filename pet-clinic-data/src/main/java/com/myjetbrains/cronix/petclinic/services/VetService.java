package com.myjetbrains.cronix.petclinic.services;

import com.myjetbrains.cronix.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
