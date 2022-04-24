package com.codegym.flight.model;

import com.codegym.employee.model.Employee;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
public class SeatFlight {

    @Id
    private Integer id;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "id_flight", referencedColumnName = "id")
    private Flight flight;
}
