package io.altar.upacademy.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import io.altar.upacademy.model.Entity;

public class EntityRepository <E extends Entity> {

	private Map<Long, E> dataBaseMap = new HashMap<>();
	
	private long index = 0;
	
	protected Long getNextId(){
		return ++index;
	}
	
	// criar 
	public Long create (E entity){
		long id = getNextId();
		
		entity.setId(id);
		dataBaseMap.put(id, entity);
		
		return id;
	}
	
	// editar
	public void edit(E entity){
		Long id = entity.getId();
		
		dataBaseMap.put(id, entity);
	}
	
	//read 
	public E dataBaseFromId(Long id){
		return dataBaseMap.get(id);
	}
	public Collection<E> dataBase(){
		return dataBaseMap.values();
	}
	
	//remove
	public void remove(Long id){
		dataBaseMap.remove(id);
	}
}
