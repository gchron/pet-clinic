package com.myjetbrains.cronix.petclinic.services.map;

import com.myjetbrains.cronix.petclinic.model.Speciality;
import com.myjetbrains.cronix.petclinic.services.SpecializationService;

import java.util.Set;

public class SpecializationMapService extends AbstractMapService<Speciality, Long> implements SpecializationService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
