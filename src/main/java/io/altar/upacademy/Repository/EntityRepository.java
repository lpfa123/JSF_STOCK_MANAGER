package io.altar.upacademy.Repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import io.altar.upacademy.model.Entity;

public class EntityRepository <E extends Entity> implements Serializable {
	private static final long serialVersionUID = 1L;

	private long index = 0;
	
	private LinkedHashMap<Long, E> dataBaseMap = new LinkedHashMap<>();
	private List<E> listShow = new ArrayList<>();
	private List<E> listEdit = new ArrayList<>();
	private List<E> selectedProduct;
	

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
		dataBaseMap.put(entity.getId(), entity);
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
	
	//remove list
	public void removeList(List<E> entityList){
		for (int i = 0; i<entityList.size(); i++){
			remove(entityList.get(i).getId());
		}
	}
	
	// utpdate da lista 
	@SuppressWarnings("unchecked")
	public void updateLists(){
		List<E> newList = new ArrayList<>();
		for (int i =0; i < dataBaseMap.size(); i++){
			newList.add((E) dataBaseMap.values().toArray()[i]);
		}
		listShow = newList;
		listEdit = newList;
	}
	

	public Map<Long, E> getDataBaseMap() {
		return dataBaseMap;
	}

	public long getIndex() {
		return index;
	}

	public void setIndex(long index) {
		this.index = index;
	}

	public List<E> getListShow() {
		return listShow;
	}

	public void setListShow(List<E> listShow) {
		this.listShow = listShow;
	}

	public List<E> getListEdit() {
		return listEdit;
	}

	public void setListEdit(List<E> listEdit) {
		this.listEdit = listEdit;
	}

	public void setDataBaseMap(LinkedHashMap<Long, E> dataBaseMap) {
		this.dataBaseMap = dataBaseMap;
	}

	public List<E> getSelectedProduct() {
		return selectedProduct;
	}

	public void setSelectedProduct(List<E> selectedProduct) {
		this.selectedProduct = selectedProduct;
	}


}
