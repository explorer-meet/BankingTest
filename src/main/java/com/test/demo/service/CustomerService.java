package com.test.demo.service;

import com.test.demo.model.Customer;
import com.test.demo.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public void getAllCustomersWithBalance() {
    }

    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer getCustomer(Long customerID) throws Exception {
        Optional<Customer> customer = customerRepository.findById(customerID);
        if(customer.isPresent()){
            return customer.get();
        }else{
            throw new Exception("There is no any customer exists");
        }

    }

}
