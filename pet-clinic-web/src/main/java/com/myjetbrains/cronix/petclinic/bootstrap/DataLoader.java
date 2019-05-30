package com.myjetbrains.cronix.petclinic.bootstrap;

import com.myjetbrains.cronix.petclinic.model.Owner;
import com.myjetbrains.cronix.petclinic.model.Vet;
import com.myjetbrains.cronix.petclinic.services.OwnerService;
import com.myjetbrains.cronix.petclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Max");
        owner1.setLastName("Kolonko");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Clyde");
        owner2.setLastName("Mi");

        ownerService.save(owner2);

        Owner owner3 = new Owner();
        owner3.setId(3L);
        owner3.setFirstName("Arya");
        owner3.setLastName("stark");

        ownerService.save(owner3);

        System.out.println("Loaded owners ....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Bonny");
        vet1.setLastName("Bunny");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Jassie");
        vet2.setLastName("James");

        vetService.save(vet2);

        System.out.println("Loaded vets ....");
    }
}
