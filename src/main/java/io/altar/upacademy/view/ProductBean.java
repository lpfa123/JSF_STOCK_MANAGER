package io.altar.upacademy.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.upacademy.Service.ProductService;
import io.altar.upacademy.model.Product;

@Named("productBean")
@RequestScoped

public class ProductBean {
	
	private Product product = new Product();
	
	private boolean disable = true;
	
	@Inject
	private ProductService productService;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public boolean isDisable() {
		return disable;
	}

	public void setDisable(boolean disable) {
		this.disable = disable;
	}

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
}
