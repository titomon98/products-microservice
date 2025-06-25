package com.msvc.products.products_microservice.repositories;

import com.msvc.products.products_microservice.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
