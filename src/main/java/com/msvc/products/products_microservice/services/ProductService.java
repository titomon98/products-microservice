package com.msvc.products.products_microservice.services;

import com.msvc.products.products_microservice.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> findAll();

    Optional<Product> findById(Long id);
}
