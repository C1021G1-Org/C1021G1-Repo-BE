package com.codegym.employee.controller;

import com.codegym.employee.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private IEmployeeService iEmployeeService;
}
