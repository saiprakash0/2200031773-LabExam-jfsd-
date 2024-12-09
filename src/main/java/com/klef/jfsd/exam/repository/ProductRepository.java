package com.klef.jfsd.exam.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.exam.model.Product;

import List;

@Repository
public interface ProductRepository extends CrudRepository<Product,Integer>
{

	List findAll();

}
