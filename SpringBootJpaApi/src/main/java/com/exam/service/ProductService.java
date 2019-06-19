package com.exam.service;

import java.util.List;

import com.exam.entity.Product;

public interface ProductService {
	Product doSave(Product pro);
	
	Product doUpdate(Product pro);

	List<Product> getAllProduct();
	
	Product getOnProduct(Integer id);
	
	void doDelete(Integer id);
}
