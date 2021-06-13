package com.springboot.microservices.demo.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "state", schema = "yisus_schema")
public class State implements Serializable {

    @Id
    @Column(name="id_state",nullable = false, unique = true)
    private long id;

    @OneToMany
    @JoinColumn(name="id_country", referencedColumnName = "id_country")
    private Country country;

    @Column(name = "name_state")
    private String name;
}
