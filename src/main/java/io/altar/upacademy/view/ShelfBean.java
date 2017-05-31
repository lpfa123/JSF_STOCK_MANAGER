package io.altar.upacademy.view;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.upacademy.Service.ShelfService;
import io.altar.upacademy.model.Shelf;

@Named("shelfBean")
@RequestScoped
public class ShelfBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Shelf shelf = new Shelf();
	
	public ShelfBean(){
		
	}
	
	@Inject
	private ShelfService shelfService;

	public Shelf getShelf() {
		return shelf;
	}

	public void setShelf(Shelf shelf) {
		this.shelf = shelf;
	}

	public ShelfService getShelfService() {
		return shelfService;
	}

	public void setShelfService(ShelfService shelfService) {
		this.shelfService = shelfService;
	}
	
	
	

}
