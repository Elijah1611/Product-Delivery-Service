package com.pds.entity;

import lombok.Data;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="customer")
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private Set<Order> orders = new HashSet<>();
}









