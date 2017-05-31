package io.altar.upacademy.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


import io.altar.upacademy.Repository.ProductRepository;
import io.altar.upacademy.model.Product;

@Named("productService")
@RequestScoped

public class ProductService implements Serializable {
	private static final long serialVersionUID=1L;
		
	private ProductRepository productRepository = ProductRepository.getInstance();

	public ProductService(){};
	

	
	public String createProductId(Product product, String nextScreen){
		productRepository.create(product);
		productRepository.edit(product);
		productRepository.updateLists();
		return nextScreen;
	}

	public String removeProductList(List <Product> productList, String nextPage){
		productRepository.removeList(productList);
		productRepository.updateLists();
		return nextPage;
		
	}

	public ProductRepository getProductRepository() {
		return productRepository;
	}

	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}	
		
	

	
}
