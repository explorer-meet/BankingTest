package com.test.demo.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String accountNumber;
    private String accountType;
    private Double balance;

    @OneToOne(mappedBy = "bankAccount", cascade = CascadeType.ALL)
    private Customer customer;

    @OneToMany(mappedBy = "bankAccount", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Transaction> transactions;

}
