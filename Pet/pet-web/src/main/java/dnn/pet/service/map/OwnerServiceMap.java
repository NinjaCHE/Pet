package dnn.pet.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import dnn.pet.model.Owner;
import dnn.pet.model.Pet;
import dnn.pet.service.OwnerService;
import dnn.pet.service.PetService;
import dnn.pet.service.PetTypeService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService{

	private final PetTypeService petTypeService;
	private final PetService petService;
	
	
	
	public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
		super();
		this.petTypeService = petTypeService;
		this.petService = petService;
	}

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner findByID(Long id) {
		return super.findByID(id);
	}

	@Override
	public Owner save(Owner object) {
		if(object != null) {
			if(object.getPets() != null) {
				object.getPets().forEach(pet -> {
					if(pet.getType() != null) {
						if(pet.getType().getId() == null) {
							pet.setType(petTypeService.save(pet.getType()));
						}
					}else {
						throw new IllegalArgumentException("Pet type required");
					}
					
					if(pet.getId() == null) {
						Pet savedPet = petService.save(pet);
						pet.setId(savedPet.getId());
					}
				});
			}
			
			return super.save(object);
		} else {
			return null;
		}
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
	public Owner findByLastName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
