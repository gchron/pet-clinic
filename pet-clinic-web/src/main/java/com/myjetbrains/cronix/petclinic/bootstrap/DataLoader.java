package com.myjetbrains.cronix.petclinic.bootstrap;

import com.myjetbrains.cronix.petclinic.model.*;
import com.myjetbrains.cronix.petclinic.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;
    private final VisitService visitService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();

        if (count == 0) {
            loadData();
        }
    }

    private void loadData() {
        Speciality radiology = new Speciality();
        radiology.setDesc("Radiology");
        Speciality savedRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDesc("Surgery");
        Speciality savedSurgery = specialityService.save(surgery);
        Speciality dentist = new Speciality();
        dentist.setDesc("Dentistry");
        Speciality savedDentistry = specialityService.save(dentist);

        com.myjetbrains.cronix.petclinic.model.PetType dog = new com.myjetbrains.cronix.petclinic.model.PetType();
        dog.setName("dog");
        com.myjetbrains.cronix.petclinic.model.PetType saveDogPetType = petTypeService.save(dog);

        com.myjetbrains.cronix.petclinic.model.PetType cat = new com.myjetbrains.cronix.petclinic.model.PetType();
        cat.setName("Cat");
        com.myjetbrains.cronix.petclinic.model.PetType saveCatPetType = petTypeService.save(cat);

        System.out.println("Loaded petTypes ....");

        Owner owner1 = new Owner();
        owner1.setFirstName("Max");
        owner1.setLastName("Kolonko");
        owner1.setAddress("Master Strasse 12");
        owner1.setCity("LOndon");
        owner1.setTelephone("989898977657");

        Owner owner2 = new Owner();
        owner2.setFirstName("Clyde");
        owner2.setLastName("Mi");
        owner2.setAddress("Master Strasse 13");
        owner2.setCity("LOndon");
        owner2.setTelephone("98989832157");

        Owner owner3 = new Owner();
        owner3.setFirstName("Arya");
        owner3.setLastName("stark");
        owner3.setAddress("Master Strasse 14");
        owner3.setCity("LOndon");
        owner3.setTelephone("98219821157");

        Pet pet1 = new Pet();
        pet1.setPetType(saveDogPetType);
        pet1.setBirthDate(LocalDate.now());
        pet1.setOwner(owner1);
        pet1.setName("Ruffy");
        owner1.getPets().add(pet1);

        Visit catVisit = new Visit();
        catVisit.setPet(pet1);
        catVisit.setDate(LocalDate.now());
        catVisit.setDesc("Hello kitty");

        Vet vet1 = new Vet();
        vet1.setFirstName("Bonny");
        vet1.setLastName("Bunny");
        vet1.getSpecialities().add(savedDentistry);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jassie");
        vet2.setLastName("James");
        vet2.getSpecialities().add(savedSurgery);

        ownerService.save(owner1);
        ownerService.save(owner2);
        ownerService.save(owner3);
        System.out.println("Loaded owners ....");
        visitService.save(catVisit);
        vetService.save(vet1);
        vetService.save(vet2);
        System.out.println("Loaded vets ....");
    }
}
