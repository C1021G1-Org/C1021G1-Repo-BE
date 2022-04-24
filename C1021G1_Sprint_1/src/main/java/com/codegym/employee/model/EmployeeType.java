package com.codegym.employee.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class EmployeeType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employeeType")
    private Set<Employee> employees;

    public EmployeeType() {
    }
}
