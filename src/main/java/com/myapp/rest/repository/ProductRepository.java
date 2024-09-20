package com.myapp.rest.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import com.myapp.rest.model.Product;

@RestResource(path = "products")
public interface ProductRepository extends MongoRepository<Product, String> {

	
	Optional<List<Product>> findByName(@Param("name") String  productName);
	
	Optional<List<Product>> findByPriceGreaterThan(@Param("price") Double  price);
}
