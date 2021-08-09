package dnn.pet.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import dnn.pet.model.Speciality;
import dnn.pet.model.Vet;
import dnn.pet.service.SpecialityService;
import dnn.pet.service.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService{

	private final SpecialityService specialityService;
	
	public VetServiceMap(SpecialityService specialityService) {
		super();
		this.specialityService = specialityService;
	}

	@Override
	public Vet save(Vet t) {
		
		if(t.getSpecialities().size() > 0) {
			t.getSpecialities().forEach(speciality ->{
				if(speciality.getId() == null) {
					Speciality savedSpeciality = specialityService.save(speciality);
					speciality.setId(savedSpeciality.getId());
				}
			});
		}
		return super.save(t);
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
	public void deleteByID(Long id) {
		super.deleteByID(id);
	}

	@Override
	public void delete(Vet object) {
		super.delete(object);
	}
	
	

}
