package com.example.reactivepostgres;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

import java.util.UUID;

@SpringBootApplication
@EnableR2dbcRepositories
public class ReactivePostgresApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReactivePostgresApplication.class, args);
    }

    @Bean
    ApplicationRunner applicationRunner(ProductRepository productRepository) {
        return args -> {
            Product product = new Product();
            product.setId(UUID.randomUUID().toString());
            product.setDescription("");
            product.setNewProduct(true);
            product.setPrice(1.0);

//            Product product2 = new Product();
            productRepository.save(product).subscribe();
//            productRepository.save(product2).subscribe();
        };
    }
}
