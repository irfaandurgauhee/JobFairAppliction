package com.elca.jobfairmanagementsystem.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;

/**
 *
 * @author koo
 */

@Getter
@Setter
@Entity
@Table(name = "qualification")
public class Qualification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
