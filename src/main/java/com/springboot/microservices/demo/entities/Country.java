package com.springboot.microservices.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "country", schema = "yisus_schema")
public class Country implements Serializable {

    @Id
    @Column(name="id_country",nullable = false, unique = true)
    private long id;

    @Column(name = "name_country")
    private String name;
}
