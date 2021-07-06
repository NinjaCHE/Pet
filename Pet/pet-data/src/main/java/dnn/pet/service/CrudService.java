package dnn.pet.service;

import java.util.Set;

public interface CrudService<T, ID> {
	
	Set<T> findAll();
	
	T findByID(ID id);
	
	T save(T t);
	
	void delete(T object);
	
	void deleteByID(ID id);

}
