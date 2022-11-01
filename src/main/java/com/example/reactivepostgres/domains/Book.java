package com.example.reactivepostgres.domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Table
public class Book implements DomainObject{
    String id;
    String title;
    Employee employee;
}
