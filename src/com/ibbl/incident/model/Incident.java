package com.ibbl.incident.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Khomeni
 * Created on : 16-May-17
 */
@Entity
@Table(name = "TIM_INCIDENT")
public class Incident implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer refNo;

    private Integer type;

    private Double lossAmt;

    private Date incidentDate;

    private Date reportingDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRefNo() {
        return refNo;
    }

    public void setRefNo(Integer refNo) {
        this.refNo = refNo;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Double getLossAmt() {
        return lossAmt;
    }

    public void setLossAmt(Double lossAmt) {
        this.lossAmt = lossAmt;
    }

    public Date getIncidentDate() {
        return incidentDate;
    }

    public void setIncidentDate(Date incidentDate) {
        this.incidentDate = incidentDate;
    }

    public Date getReportingDate() {
        return reportingDate;
    }

    public void setReportingDate(Date reportingDate) {
        this.reportingDate = reportingDate;
    }
}
