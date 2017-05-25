package io.altar.upacademy.Repository;

import java.io.Serializable;




import io.altar.upacademy.model.Product;

public class ProductRepository extends EntityRepository<Product> implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private static final ProductRepository INSTANCE = new ProductRepository();
    
    private ProductRepository() {}
    
    public static ProductRepository getInstance() {
        return INSTANCE;
    }

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
