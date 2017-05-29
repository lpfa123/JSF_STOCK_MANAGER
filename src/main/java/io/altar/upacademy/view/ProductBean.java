package io.altar.upacademy.view;


import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;


import io.altar.upacademy.Service.ProductService;
import io.altar.upacademy.model.Product;

@ManagedBean(name="productBean", eager=true)	
@RequestScoped

public class ProductBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Product product = new Product();
	
	private boolean editable;
	
	public ProductBean(){};
	
	
	@Inject
	private ProductService productService;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}


	
}
