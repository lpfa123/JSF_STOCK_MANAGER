package io.altar.upacademy.Repository;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import io.altar.upacademy.model.Shelf;

@Named("shelfRepository")
@ApplicationScoped
public class ShelfRepository extends EntityRepository<Shelf> implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private static ShelfRepository Instance = new ShelfRepository();
	
	private ShelfRepository(){
		
	}

	public static ShelfRepository getInstance() {
		return Instance;
	}

	
}
