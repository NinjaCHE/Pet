package dnn.pet.service;

import java.util.Set;

import dnn.pet.model.Vet;

public interface VetService {
	
	Vet findById(Long id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();

}
