package io.altar.upacademy.Service;


import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


import io.altar.upacademy.Repository.ProductRepository;
import io.altar.upacademy.model.Product;

@Named("productService")
@RequestScoped

public class ProductService  {

	
	public List <Product> listProducts(){
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
	
	public String editProduct(Product product, String nextScreen){
		ProductRepository.getInstance().edit(product);
		return nextScreen;
	}

	
}
