package io.altar.upacademy.Repository;

import io.altar.upacademy.model.Product;

public class ProductRepository extends EntityRepository<Product> {
	
	private static final ProductRepository INSTANCE = new ProductRepository();
    
    private ProductRepository() {}
    
    public static ProductRepository getInstance() {
        return INSTANCE;
    }

}
