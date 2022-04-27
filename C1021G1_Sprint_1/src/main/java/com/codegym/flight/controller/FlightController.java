package com.codegym.flight.controller;

import com.codegym.flight.service.IFlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightController {

    @Autowired
    private IFlightService service;

}
