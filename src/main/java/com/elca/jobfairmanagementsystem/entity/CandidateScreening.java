package com.elca.jobfairmanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 *
 * @author ghr
 */
@Data
@Entity
@Table(name = "candidate_screening")
public class CandidateScreening {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CandidateScreeningId;

    @Column(name = "interview_date")
    private Data InterviewDate;

    @Column(name = "position_job")
    private String PositionJob;

    @Column(name = "interviewer_name")
    private String InterviewerName;

    @Column(name = "interviewer_feedback")
    private String InterviewerFeedback;

    @Column(name = "screening_status")
    private String ScreeningStatus;


}
