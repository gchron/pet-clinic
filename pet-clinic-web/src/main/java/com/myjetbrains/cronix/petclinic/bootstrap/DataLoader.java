package com.myjetbrains.cronix.petclinic.bootstrap;

import com.myjetbrains.cronix.petclinic.model.Owner;
import com.myjetbrains.cronix.petclinic.model.PetType;
import com.myjetbrains.cronix.petclinic.model.Vet;
import com.myjetbrains.cronix.petclinic.services.OwnerService;
import com.myjetbrains.cronix.petclinic.services.PetTypeService;
import com.myjetbrains.cronix.petclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;


    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setPetType("dog");
        PetType saveDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setPetType("Cat");
        PetType saveCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Max");
        owner1.setLastName("Kolonko");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Clyde");
        owner2.setLastName("Mi");

        ownerService.save(owner2);

        Owner owner3 = new Owner();
        owner3.setFirstName("Arya");
        owner3.setLastName("stark");

        ownerService.save(owner3);

        System.out.println("Loaded owners ....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Bonny");
        vet1.setLastName("Bunny");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jassie");
        vet2.setLastName("James");

        vetService.save(vet2);



        System.out.println("Loaded vets ....");
    }
}
