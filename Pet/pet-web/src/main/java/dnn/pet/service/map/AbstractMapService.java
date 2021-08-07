package dnn.pet.service.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import dnn.pet.model.BaseEntity;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {
	
	protected Map<Long, T> map = new HashMap<>();
	
	Set<T> findAll(){
		return new HashSet<>(map.values());
	}

	T findByID(ID id) {
		return map.get(id);
	}
	
	T save(T object) {
		
		if(object != null) {
			object.setId(getNextID());
		}else {
			throw new IllegalArgumentException("Object cannot be null");
		}
		map.put(object.getId(), object);
		return object;
	}
	
	void deleteByID(ID id) {
		map.remove(id);
	}
	
	void delete(T object) {
		map.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}
	
	private long getNextID() {
		
		long id = 0;
		try {
			id = Collections.max(map.keySet()) + 1;
		}catch(Exception e) {
			id = 1;
		}
		 return id;
	}
}
