package com.springboot.microservices.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "address", schema = "yisus_schema")
public class Address implements Serializable {
    @Id
    @Column(name="id_address",nullable = false, unique = true)
    private long id;

    @Column(name = "street")
    private String street;

    @Column(name = "zipcode")
    private String zipcode;

    private Country country;
    private State state;


}
