package com.elca.jobfairmanagementsystem.dto;

import lombok.Data;

@Data
public class JobDto {

    private Long jobId;

    private String jobTitle;

    private String description;

    private String  minimumExperience;

    private String qualificationNeeded;
}
