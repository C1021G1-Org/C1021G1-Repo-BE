package com.codegym.employee.model;

import com.codegym.ticket.model.Ticket;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;
import java.util.Set;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String code;

    private Boolean gender;

    @Column(columnDefinition = "DATE")
    private String birthday;

    private String phone;

    private String email;

    private String address;

    private Boolean delFlag;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "id_employee_type", referencedColumnName = "id")
    private EmployeeType employeeType;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    private Set<Ticket> ticketE;

    public Employee() {
    }

}
