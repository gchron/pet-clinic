package com.myjetbrains.cronix.petclinic.services.map;

import com.myjetbrains.cronix.petclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class PetTypeMapService extends AbstractMapService<com.myjetbrains.cronix.petclinic.model.PetType, Long> implements PetTypeService {
    @Override
    public Set<com.myjetbrains.cronix.petclinic.model.PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(com.myjetbrains.cronix.petclinic.model.PetType object) {
        super.delete(object);
    }

    @Override
    public com.myjetbrains.cronix.petclinic.model.PetType save(com.myjetbrains.cronix.petclinic.model.PetType object) {
        return super.save(object);
    }

    @Override
    public com.myjetbrains.cronix.petclinic.model.PetType findById(Long id) {
        return super.findById(id);
    }
}
