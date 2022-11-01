package com.example.reactivepostgres.domains;

import com.example.reactivepostgres.DomainObject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("employee")
public class Employee implements DomainObject {
    String id;
    String name;
}
