package com.springboot.microservices.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "department",schema = "yisus_schema")
public class Department implements Serializable {
    @Id
    @Column(name="id_department",nullable = false, unique = true)
    private long id;

    @Column(name = "name_department")
    private String name;
}
