package com.codegym.flight.service.impl;

import com.codegym.flight.repository.IFlightRepository;
import com.codegym.flight.service.IFlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService implements IFlightService {

    @Autowired
    private IFlightRepository repository;
}
