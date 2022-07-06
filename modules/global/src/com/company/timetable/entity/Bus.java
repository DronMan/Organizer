package com.company.timetable.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "TIMETABLE_BUS")
@Entity(name = "timetable_Bus")
@NamePattern("%s %s|busNumber,driverPhone")
public class Bus extends StandardEntity {
    private static final long serialVersionUID = -3315779266622938046L;

    @NotNull
    @Column(name = "BUS_NUMBER", nullable = false, unique = true)
    private String busNumber;

    @Column(name = "DRIVER_NAME")
    private String driverName;

    @NotNull
    @Column(name = "DRIVER_PHONE", nullable = false, unique = true)
    private String driverPhone;

    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }
}