package com.codegym.flight.model;

import com.codegym.customer.model.Customer;
import com.codegym.ticket.model.Ticket;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Flight {

    @Id
    private Integer id;

    private String airline;

    private String code;

    private String from;

    private String to;

    @Column(columnDefinition = "DATE")
    private String dateStart;

    @Column(columnDefinition = "DATE")
    private String dateEnd;

    private Double price;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "flight")
    private Set<Ticket> tickets;
}
