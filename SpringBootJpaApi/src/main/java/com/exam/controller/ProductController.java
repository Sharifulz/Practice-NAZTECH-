package com.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.entity.Product;
import com.exam.service.ProductService;

@RequestMapping("/product")
@RestController
public class ProductController {

		@Autowired
		private ProductService proservice;
		
		@PostMapping("/save")
		public void doSaveProduct(@RequestBody Product pro) {
			proservice.doSave(pro);
		}
		
		@PutMapping("/update")
		public Product doUpdateProduct(@RequestBody Product pro) {
			return proservice.doUpdate(pro);
		}
		
		@GetMapping("/all")
		public List<Product> getAllProduct(){
			return proservice.getAllProduct();
		}
		
		@GetMapping("/by/{proId}")
		public Product getProduct(@PathVariable(name="proId") Integer id) {
			
			return proservice.getOnProduct(id);
			
		}
		
		@DeleteMapping("/delete/{proId}")
		public void deleteProduct(@PathVariable(name="proId") Integer id) {
			proservice.doDelete(id);
		}
		
		
}
