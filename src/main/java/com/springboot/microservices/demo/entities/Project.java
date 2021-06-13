package com.springboot.microservices.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="project",schema="yisus_schema")
public class Project implements Serializable {

    @Id
    @Column(name="id_project",nullable = false, unique = true)
    private long id;

    @Column(name = "name_project")
    private String name;

    @Column(name = "description_project")
    private String description;

}
