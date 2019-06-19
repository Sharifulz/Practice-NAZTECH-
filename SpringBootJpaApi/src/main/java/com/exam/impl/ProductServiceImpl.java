package com.exam.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.ProductDao;
import com.exam.entity.Product;
import com.exam.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDao pd;
	
	@Override
	public Product doSave(Product pro) {	
		return pd.save(pro);
	}

	@Override
	public Product doUpdate(Product pro) {
		
		return pd.saveAndFlush(pro);
	}

	@Override
	public List<Product> getAllProduct() {
		
		return pd.findAll();
	}

	@Override
	public Product getOnProduct(Integer id) {
		
		return pd.findOne(id);
	}

	@Override
	public void doDelete(Integer id) {
		pd.delete(id);

	}

}
