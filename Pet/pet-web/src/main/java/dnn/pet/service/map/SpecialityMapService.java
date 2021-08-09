package dnn.pet.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import dnn.pet.model.Speciality;
import dnn.pet.service.SpecialityService;

@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService {

	@Override
	public Set<Speciality> findAll() {
		return super.findAll();
	}

	@Override
	public Speciality findByID(Long id) {
		return super.findByID(id);
	}

	@Override
	public Speciality save(Speciality t) {
		return super.save(t);
	}

	@Override
	public void delete(Speciality object) {
		super.delete(object);

	}

	@Override
	public void deleteByID(Long id) {
		super.deleteByID(id);

	}

}
