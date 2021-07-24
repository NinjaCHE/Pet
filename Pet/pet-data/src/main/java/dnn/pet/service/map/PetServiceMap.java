package dnn.pet.service.map;

import java.util.Set;

import dnn.pet.model.Pet;
import dnn.pet.service.CrudService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long>{

	@Override
	public Pet save(Pet t) {
		return super.save(t.getId(), t);
	}

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public Pet findByID(Long id) {
		return super.findByID(id);
	}

	@Override
	Pet save(Long id, Pet object) {
		return super.save(id, object);
	}

	@Override
	public void deleteByID(Long id) {
		super.deleteByID(id);
	}

	@Override
	public void delete(Pet object) {
		super.delete(object);
	}
	
	

}