package dnn.pet.service;

import java.util.Set;

import dnn.pet.model.Owner;

public interface OwnerService {
	
	Owner findByLastName(String name);
	
	Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();
}
