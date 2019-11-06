package com.elca.jobfairmanagementsystem.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "qualification")
public class Qualification {

    @Column
    private Long qualificationId;

    @Column
    private String title;

    @Column
    private String result;

    @Column
    private String institution;

    @Column
    @Temporal(TemporalType.DATE)
    private Date dateFrom;

    @Column
    @Temporal(TemporalType.DATE)
    private Date dateTo;



}
