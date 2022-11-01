package com.example.reactivepostgres.repository;

import com.example.reactivepostgres.domains.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

//@Repository
public interface ProductRepository extends ReactiveCrudRepository<Product, String> {
}
