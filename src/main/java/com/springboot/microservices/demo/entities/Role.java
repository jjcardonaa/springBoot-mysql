package com.springboot.microservices.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="role",schema="yisus_schema")
public class Role implements Serializable {

    @Id
    @Column(name="id_role",nullable = false, unique = true)
    private long id;

    @Column(name = "name_role")
    private String name;

    @Column(name = "description_role")
    private String description;
}
