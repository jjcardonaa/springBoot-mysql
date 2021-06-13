package com.springboot.microservices.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "company",schema = "yisus_schema")
public class Company implements Serializable {
    @Id
    @Column(name="id_company",nullable = false, unique = true)
    private long id;

    @Column(name = "name_company")
    private String name;

    @Column(name = "phone_company")
    private String phone;


}
