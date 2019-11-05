package com.elca.jobfairmanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

/**
 *
 * @author ghr
 */
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int candidateId;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Size(max = 50)
    @Email
    private String email;

    @Column
    private int mobileNo;

    @Column
    private int phoneNo;
    @Column
    private String address;
    @Column
    private String Nationality;

}
