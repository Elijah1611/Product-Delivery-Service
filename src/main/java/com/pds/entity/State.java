package com.pds.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
}
