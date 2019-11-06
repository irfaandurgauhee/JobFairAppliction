package com.elca.jobfairmanagementsystem.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

/**
 *
 * @author ghr
 */
@Data
public class CandidateScreeningDto {
    private Long CandidateScreeningId;
    private Data InterviewDate;
    private String PositionJob;
    private String InterviewerName;
    private String InterviewerFeedback;
    private String ScreeningStatus;
}
