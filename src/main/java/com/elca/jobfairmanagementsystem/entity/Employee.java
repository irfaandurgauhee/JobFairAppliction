package com.elca.jobfairmanagementsystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Data
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;

    @Column
    @Length(max = 3)
    private String visa;

    @Column(name = "fname", length = 50, nullable = false)
    private String firstName;

    @Column(name = "lname", length = 50, nullable = false)
    private String lastName;

    @Column(name = "email", length = 50, unique = true, nullable = false)
    private String email;

    @Column(name = "password", length = 100, nullable = false)
    private String password;


}