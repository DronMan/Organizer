package com.company.timetable.entity;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.time.LocalDateTime;

@Table(name = "TIMETABLE_SERVICE")
@Entity(name = "timetable_Service")
@NamePattern("%s|serviceType")
public class Service extends StandardEntity {
    private static final long serialVersionUID = 1013720616963176293L;

    @NotNull
    @Column(name = "SERVICE_TYPE", nullable = false)
    private String serviceType;

    @NotNull
    @Column(name = "START_DATE", nullable = false)
    private LocalDateTime startDate;

    @NotNull
    @Column(name = "DURATION", nullable = false)
    @Positive
    private Integer duration;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BUS_ID")
    private Bus bus;

    @Lob
    @Column(name = "DESCRIPTION")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @MetaProperty(related = {"startDate", "duration"})
    public LocalDateTime getEndDate() {
        return (startDate != null && duration != null) ? startDate.plusHours(duration) : null;
    }
}