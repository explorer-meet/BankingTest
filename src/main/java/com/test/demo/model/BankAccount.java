package com.test.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "bankAccount")
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "accountNumber")
    private String accountNumber;

    @Column(name = "accountType")
    private String accountType;

    @Column(name = "balance")
    private Long balance;

  /*  @OneToOne(mappedBy = "id")
    private Customer customer;*/

   /* @OneToMany(orphanRemoval = true,cascade = CascadeType.ALL,mappedBy = "id")
    private Transaction transaction;*/
}
