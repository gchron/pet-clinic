package com.myjetbrains.cronix.petclinic.services.springdatajpa;

import com.myjetbrains.cronix.petclinic.repositories.PetTypeRepository;
import com.myjetbrains.cronix.petclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetTypeSDJpaService implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    public PetTypeSDJpaService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<com.myjetbrains.cronix.petclinic.model.PetType> findAll() {
        Set<com.myjetbrains.cronix.petclinic.model.PetType> types = new HashSet<>();
        petTypeRepository.findAll().forEach(t -> types.add(t));
        return types;
    }

    @Override
    public com.myjetbrains.cronix.petclinic.model.PetType findById(Long aLong) {
        return petTypeRepository.findById(aLong).orElse(null);
    }

    @Override
    public com.myjetbrains.cronix.petclinic.model.PetType save(com.myjetbrains.cronix.petclinic.model.PetType object) {
        return petTypeRepository.save(object);
    }

    @Override
    public void delete(com.myjetbrains.cronix.petclinic.model.PetType object) {
        petTypeRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petTypeRepository.deleteById(aLong);
    }
}
