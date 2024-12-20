package com.test.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "mobileNumber")
    private String mobileNumber;

    @OneToOne(mappedBy = "accountId")
    private BankAccount account;

}