package com.test.demo.controller;

import com.test.demo.model.Customer;
import com.test.demo.service.CustomerService;
import jakarta.websocket.server.PathParam;
import lombok.SneakyThrows;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomers(){
        return new ResponseEntity<>(customerService.getAllCustomers(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @SneakyThrows
    public ResponseEntity<Customer> getCustomer(@RequestParam Long customerID){
        return new ResponseEntity<>(customerService.getCustomer(customerID), HttpStatus.OK);
    }

    @GetMapping("/byBalance")
    public void getAllCustomersWithBalance(){
        customerService.getAllCustomersWithBalance();
    }

    @PostMapping
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
        return new ResponseEntity<>(customerService.addCustomer(customer),HttpStatus.CREATED);
    }
}
