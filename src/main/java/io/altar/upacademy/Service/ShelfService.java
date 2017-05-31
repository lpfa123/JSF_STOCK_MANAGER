package io.altar.upacademy.Service;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import io.altar.upacademy.Repository.ShelfRepository;
import io.altar.upacademy.model.Shelf;

@Named("shelfService")
@RequestScoped
public class ShelfService implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private ShelfRepository shelfRepository = ShelfRepository.getInstance();
	
	public ShelfService(){
		
	}
	
	private String createShelf(Shelf shelf, String nextPage){
		shelfRepository.create(shelf);
		shelfRepository.edit(shelf);
		return nextPage;
	}
	
	private String removeShelf(List<Shelf> shelfList, String nextPage){
		shelfRepository.removeList(shelfList);
		shelfRepository.updateLists();
		return nextPage;
	}

	public ShelfRepository getShelfRepository() {
		return shelfRepository;
	}

	public void setShelfRepository(ShelfRepository shelfRepository) {
		this.shelfRepository = shelfRepository;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
