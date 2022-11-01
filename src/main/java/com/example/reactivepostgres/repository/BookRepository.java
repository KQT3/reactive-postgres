package com.example.reactivepostgres.repository;

import com.example.reactivepostgres.domains.Book;
import com.example.reactivepostgres.domains.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface BookRepository extends ReactiveCrudRepository<Book, String> {
}
