package com.example.reactivepostgres;

import com.example.reactivepostgres.domains.Employee;
import com.example.reactivepostgres.domains.Product;
import com.example.reactivepostgres.repository.EmployeeRepository;
import com.example.reactivepostgres.repository.ProductRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
//@EnableR2dbcRepositories
public class ReactivePostgresApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReactivePostgresApplication.class, args);
    }

    @Bean
    ApplicationRunner applicationRunner(ProductRepository productRepository, EmployeeRepository employeeRepository) {
        return args -> {
            Product product1 = new Product(UUID.randomUUID().toString(), "desc", 2.0, true);
            Product product2 = new Product(UUID.randomUUID().toString(), "desc", 2.0, true);
            Product product3 = new Product(UUID.randomUUID().toString(), "desc", 2.0, true);
            Product product4 = new Product(UUID.randomUUID().toString(), "desc", 2.0, true);
            Product product5 = new Product(UUID.randomUUID().toString(), "desc", 2.0, true);

            productRepository.save(product1).subscribe();
            productRepository.findAll().subscribe(System.out::println);


            Employee name = new Employee(UUID.randomUUID().toString(), "name");
            employeeRepository.save(name).subscribe();
            employeeRepository.findAll().subscribe(System.out::println);
        };
    }
}
