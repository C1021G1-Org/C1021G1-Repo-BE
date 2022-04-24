package com.codegym.ticket.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String code;

    private String position;

    @OneToOne(mappedBy = "seat")
    private Ticket ticket;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "id_seat_type", referencedColumnName = "id")
    private SeatType seatType;

    public Seat() {
    }
}
