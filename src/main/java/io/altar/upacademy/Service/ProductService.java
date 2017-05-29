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
	
	public static List <Product> listProducts(){
		List<Product> productList = new ArrayList<>();
		for(long i = 1; i <= ProductRepository.getInstance().dataBase().size(); i++){
			productList.add(ProductRepository.getInstance().dataBaseFromId(i));
		}
		return productList;
	}
	
	
	
	public String createProductId(Product product, String nextScreen){
		ProductRepository.getInstance().create(product);
		return nextScreen;
	}
	

	public String removeProductList(List<Product> productList, String nextPage){
		productRepository.removeList(productList);
		productRepository.updateLists();
		return nextPage;
		
	}	
		
	
		

	
}
