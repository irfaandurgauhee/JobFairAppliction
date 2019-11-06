package com.elca.jobfairmanagementsystem.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id")
    private Long jobId;

    @Column(name = "job_title")
    private String jobTitle;

    @Column
    private String description;

    @Column(name = "minimum_experience")
    private String  minimumExperience;

    @Column(name = "qualification_needed")
    private String qualificationNeeded;
}
