package com.sandeep.flyway.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employe {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id ;

    private  String name ;
    private  String department ;

    private  String boos;

    private  Long salary;
}
