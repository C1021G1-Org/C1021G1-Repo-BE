package com.codegym.ticket.model;

import javax.persistence.*;
import java.util.Set;


@Entity  // Hạng ghế( Thương gia, thường )
public class SeatType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "seat_type")
    private Set<Seat> seats;

    public SeatType() {
    }
}
