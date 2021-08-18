package dnn.pet.repositories;

import org.springframework.data.repository.CrudRepository;

import dnn.pet.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
