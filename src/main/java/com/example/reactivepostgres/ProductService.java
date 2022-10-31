package com.example.reactivepostgres;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository repository) {
        this.productRepository = repository;
    }

    public Mono<Product> createProduct(final Product product) {
        return this.productRepository.save(product);
    }

    public Flux<Product> getAllProducts() {
        return this.productRepository
                .findAll();
    }

    @Transactional
    public Mono<Product> updateProduct(final Product product) {
        return this.productRepository.findById(product.getId())
                .flatMap(p -> {
                    p.setDescription(product.getDescription());
                    p.setPrice(product.getPrice());
                    return this.productRepository.save(p);
                })
                .switchIfEmpty(this.productRepository.save(product.setAsNew()));
    }

    @Transactional
    public Mono<Void> deleteProduct(final String id) {
        return this.productRepository.findById(id)
                .flatMap(this.productRepository::delete);
    }

    @Transactional
    public Mono<Product> delete(String id) {
        return this.productRepository
                .findById(id)
                .flatMap(p -> this.productRepository.deleteById(p.getId()).thenReturn(p));
    }

}
