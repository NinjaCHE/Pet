package dnn.pet.service;

import dnn.pet.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
	
	Owner findByLastName(String name);
	
}
