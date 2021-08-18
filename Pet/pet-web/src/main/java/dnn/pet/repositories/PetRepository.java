package dnn.pet.repositories;

import org.springframework.data.repository.CrudRepository;

import dnn.pet.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
