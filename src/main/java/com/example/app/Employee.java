package com.example.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    int id;

    @Column
    String name;

    @Column
    int salary;
}
