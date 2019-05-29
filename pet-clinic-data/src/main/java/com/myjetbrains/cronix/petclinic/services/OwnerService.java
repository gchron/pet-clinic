package com.myjetbrains.cronix.petclinic.services;

import com.myjetbrains.cronix.petclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
