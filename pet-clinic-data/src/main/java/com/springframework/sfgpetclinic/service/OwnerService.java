package com.springframework.sfgpetclinic.service;

import java.util.Set;

import com.springframework.sfgpetclinic.model.Owner;

public interface OwnerService {
	Owner findById(Long id);
	Owner findByLastName(String lastName);
	Owner save(Owner owner);
	Set<Owner> findAll();
}
