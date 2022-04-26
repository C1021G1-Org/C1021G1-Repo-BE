package com.codegym.customer.controller;

import com.codegym.customer.model.Countries;
import com.codegym.customer.service.ICountriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class CountriesController {

    @Autowired
    private ICountriesService service;

    /* Lấy danh sách tài nguyên */
    @GetMapping("/country/api/v1")
    public ResponseEntity<List<Countries>> getCustomerList() {
        List<Countries> countriesList = service.fillAll();
        if (countriesList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(countriesList, HttpStatus.OK);
    }
}
