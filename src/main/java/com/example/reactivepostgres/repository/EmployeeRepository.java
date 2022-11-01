package com.example.reactivepostgres.repository;

import com.example.reactivepostgres.domains.Employee;
import com.example.reactivepostgres.domains.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface EmployeeRepository extends ReactiveCrudRepository<Employee, String> {
}
