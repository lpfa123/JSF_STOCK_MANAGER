package io.altar.upacademy.Repository;

import java.util.Collection;



import java.util.HashMap;
import java.util.Map;

import io.altar.upacademy.model.Entity;

public class EntityRepository <E extends Entity> {

	private Map<Long, E> dataBaseMap = new HashMap<>();
	
	private long index = 0;
	
	public Long getNextId(){
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

	public Map<Long, E> getDataBaseMap() {
		return dataBaseMap;
	}

	public void setDataBaseMap(Map<Long, E> dataBaseMap) {
		this.dataBaseMap = dataBaseMap;
	}

	public long getIndex() {
		return index;
	}

	public void setIndex(long index) {
		this.index = index;
	}
}
