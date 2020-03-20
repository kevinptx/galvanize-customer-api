package com.galvanize.controllers;

import com.galvanize.entities.Customer;
import com.galvanize.repositories.JpaCustomerServiceDao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Service;
import java.util.List;

@RestController
@RequestMapping("/api/service")
public class CustomerServiceController {
    JpaCustomerServiceDao repository;
    @GetMapping
    public List<Customer> getAllCustomerServiceTickets () {
        return repository.findAll();
    }
}
