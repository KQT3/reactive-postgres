package com.example.reactivepostgres.domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("employee")
public class Employee implements DomainObject {
    String id;
    String name;
//    List<Book> books;
}
