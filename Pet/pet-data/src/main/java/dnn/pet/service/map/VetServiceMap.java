package dnn.pet.service.map;

import java.util.Set;

import dnn.pet.model.Vet;
import dnn.pet.service.VetService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService{

	@Override
	public Vet save(Vet t) {
		return super.save(t.getId(), t);
	}

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public Vet findByID(Long id) {
		return super.findByID(id);
	}

	@Override
	public Vet save(Long id, Vet object) {
		return super.save(id, object);
	}

	@Override
	public void deleteByID(Long id) {
		super.deleteByID(id);
	}

	@Override
	public void delete(Vet object) {
		super.delete(object);
	}
	
	

}
