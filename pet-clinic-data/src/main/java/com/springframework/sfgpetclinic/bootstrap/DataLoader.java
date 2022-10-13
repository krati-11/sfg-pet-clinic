package com.springframework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springframework.sfgpetclinic.model.*;
import com.springframework.sfgpetclinic.service.*;
import com.springframework.sfgpetclinic.service.map.*;

@Component
public class DataLoader implements CommandLineRunner{

	private final OwnerService ownerService;
	private final VetService vetService;
	

	public DataLoader() {
		ownerService = new OwnerServiceMap();
		vetService = new VetServiceMap();
	}
	
	@Override
	public void run(String... args) throws Exception {
		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstName("Michael");
		owner1.setLastName("Weston");
		
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setFirstName("Devesh");
		owner2.setLastName("Vaishnao");
		
		ownerService.save(owner2);
		
		System.out.println("Loaded owners....");
		
		Vet vet1 = new Vet();
		vet1.setFirstName("Sam");
		vet1.setId(1L);
		vet1.setLastName("Jhonson");
		
		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setFirstName("John");
		vet2.setId(2L);
		vet2.setLastName("Thompson");
		
		vetService.save(vet2);
		
		System.out.println("Loaded Vets.....");
	}


}
