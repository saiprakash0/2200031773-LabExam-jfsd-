package com.klef.jfsd.exam.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.klef.jfsd.exam.model.Product;
import com.klef.jfsd.exam.repository.ProductRepository;

public class ProductServiceImpl implements ProductService
{

	@Autowired
	private ProductRepository repository;

	
	@Override
	public String add(Product s) {
		repository.save(s);
		return "Product added successfully";
	}

	@Override
	public Product view(int pid) {
		return (List<Product>) repository.findAll();
	}

	
	

}
