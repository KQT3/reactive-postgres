package com.example.reactivepostgres;

import com.example.reactivepostgres.domains.Book;
import com.example.reactivepostgres.domains.Employee;
import com.example.reactivepostgres.domains.Product;
import com.example.reactivepostgres.repository.BookRepository;
import com.example.reactivepostgres.repository.EmployeeRepository;
import com.example.reactivepostgres.repository.ProductRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.UUID;

@SpringBootApplication
//@EnableR2dbcRepositories
public class ReactivePostgresApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReactivePostgresApplication.class, args);
    }

    @Bean
    ApplicationRunner applicationRunner(ProductRepository productRepository,
                                        EmployeeRepository employeeRepository,
                                        BookRepository bookRepository) {
        return args -> {
            Product product1 = new Product(UUID.randomUUID().toString(), "desc", 2.0, true);
            Product product2 = new Product(UUID.randomUUID().toString(), "desc", 2.0, true);
            Product product3 = new Product(UUID.randomUUID().toString(), "desc", 2.0, true);
            Product product4 = new Product(UUID.randomUUID().toString(), "desc", 2.0, true);
            Product product5 = new Product(UUID.randomUUID().toString(), "desc", 2.0, true);

            productRepository.save(product1).subscribe();
            productRepository.findAll().subscribe(System.out::println);

//
//            Employee employee = new Employee(UUID.randomUUID().toString(), "name");
//            Book book = new Book(UUID.randomUUID().toString(), "title", employee);
//
//            employeeRepository.save(employee).subscribe();
//            bookRepository.save(book).subscribe();
//
//            employeeRepository.findAll().subscribe(System.out::println);
        };
    }
}
