package com.sandeep.flyway.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id ;

    private  String name ;

    private  String email;

    private  String address;

    private  Long phoneNumber;

    private  String fatherName ;

}
