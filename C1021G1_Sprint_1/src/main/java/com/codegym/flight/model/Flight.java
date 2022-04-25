package com.codegym.flight.model;

import com.codegym.ticket.model.Seat;
import com.codegym.ticket.model.Ticket;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;


@Entity
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String airline;

    private String codeFlight;

    private String fromFlight;

    private String toFlight;

    private String dateStart;

    private String dateEnd;

    private Double priceFlight;

    private Boolean delFlagFlight;

    @JsonBackReference
    @OneToMany(mappedBy = "flightS")
    private Set<Seat> seats;

    @JsonBackReference
    @OneToMany(mappedBy = "flightT")
    private Set<Ticket> tickets;

    public Flight() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getCodeFlight() {
        return codeFlight;
    }

    public void setCodeFlight(String codeFlight) {
        this.codeFlight = codeFlight;
    }

    public String getFromFlight() {
        return fromFlight;
    }

    public void setFromFlight(String fromFlight) {
        this.fromFlight = fromFlight;
    }

    public String getToFlight() {
        return toFlight;
    }

    public void setToFlight(String toFlight) {
        this.toFlight = toFlight;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Double getPriceFlight() {
        return priceFlight;
    }

    public void setPriceFlight(Double priceFlight) {
        this.priceFlight = priceFlight;
    }

    public Boolean getDelFlagFlight() {
        return delFlagFlight;
    }

    public void setDelFlagFlight(Boolean delFlagFlight) {
        this.delFlagFlight = delFlagFlight;
    }

    public Set<Seat> getSeats() {
        return seats;
    }

    public void setSeats(Set<Seat> seats) {
        this.seats = seats;
    }

    public Set<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Set<Ticket> tickets) {
        this.tickets = tickets;
    }
}
