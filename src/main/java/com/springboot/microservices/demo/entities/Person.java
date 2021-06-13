package com.springboot.microservices.demo.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Person implements Serializable {

    @Id
    @Column(name="id_person",nullable = false, unique = true)
    private long id;

    @OneToOne
    private Address address;
    @JoinColumn(name="id_address", referencedColumnName = "id_address")


    @Column(name = "id_visa")
    private String visa;
    @Column(name = "id_passport")
    private String passport;
    @Column(name = "name")
    private String name;
    @Column(name = "last_name")
    private String last_name;
    @Column(name = "middle_name")
    private String middle_name;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "email")
    private String email;
    @Column(name = "email2")
    private String email2;
    @Column(name = "date_join")
    private String date_join;
    @Column(name = "rate")
    private String rate;
    @Column(name = "i94")
    private String i94;
    @Column(name = "age")
    private String age;
    @Column(name = "present_employer")
    private String present_employeer;
    @Column(name = "gender")
    private String gender;
    @Column(name = "nationality")
    private String nationality;
    @Column(name = "passport_from")
    private String passport_from;
    @Column(name = "passport_expired")
    private String passport_expired;
    @Column(name = "visa_issued")
    private String visa_issued;
    @Column(name = "visa_expire")
    private String visa_expire;
    @Column(name = "address1")
    private String address1;
    @Column(name = "zip_code")
    private String zip_code;
    @Column(name = "years_experience")
    private String years_experience;
    @Column(name = "status")
    private String status;
    @Column(name = "degree")
    private String degree;

}
