package dnn.pet.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import dnn.pet.model.Owner;
import dnn.pet.service.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService{

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner findByID(Long id) {
		return super.findByID(id);
	}

	@Override
	public Owner save(Long id, Owner object) {
		return super.save(id, object);
	}

	@Override
	public void deleteByID(Long id) {
		super.deleteByID(id);
	}

	@Override
	public void delete(Owner object) {
		super.delete(object);
	}

	@Override
	public Owner save(Owner t) {
		return super.save(t.getId(), t);
	}

	@Override
	public Owner findByLastName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
