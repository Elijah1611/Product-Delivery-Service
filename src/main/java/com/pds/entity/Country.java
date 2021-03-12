package com.pds.entity;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "country")
@Data
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String code;

    @Column
    private String name;
}
