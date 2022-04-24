package com.codegym.ticket.model;

import com.codegym.customer.model.Customer;
import com.codegym.employee.model.Employee;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String code;

    private String email;

    private String phone;

    private Boolean gender;

    private Boolean status;
                // Giá vé
    private Double price;

    private Boolean delFlag;

    private String point;
                // Người mua vé
    private String buyer;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_seat", referencedColumnName = "id")
    private Seat seat;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "id_employee", referencedColumnName = "id")
    private Employee employee;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "id_customer", referencedColumnName = "id")
    private Customer customer;

    public Ticket() {
    }
}
