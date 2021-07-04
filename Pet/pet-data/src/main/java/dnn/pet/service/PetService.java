package dnn.pet.service;

import java.util.Set;

import dnn.pet.model.Pet;

public interface PetService {
	
	Pet findById(Long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();

}
