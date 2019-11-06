package com.elca.jobfairmanagementsystem.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "experience")
public class Experience {

    @Column
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
