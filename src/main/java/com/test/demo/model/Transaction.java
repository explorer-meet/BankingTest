package com.test.demo.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "transactionDate")
    private LocalDate transactionDate;

    @Column(name = "amount")
    private Long amount;

    @Column(name = "transactionType")
    private String transactionType;

   /* @ManyToOne(cascade = CascadeType.ALL)
    private BankAccount bankAccount;*/

}
