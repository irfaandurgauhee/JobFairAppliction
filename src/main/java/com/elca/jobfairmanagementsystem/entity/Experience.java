package com.elca.jobfairmanagementsystem.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "experience")
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long experienceId;

    @Column
    private String companyName;

    @Column
    private String position;

    @Column
    private String duration;

    @Column
    private String leavingReason;

}
