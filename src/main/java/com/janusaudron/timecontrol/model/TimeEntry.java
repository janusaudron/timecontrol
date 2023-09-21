package com.janusaudron.timecontrol.model;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document
@Getter @Setter
public class TimeEntry {
    @Id
    private Integer id;
    private Date date;
    private Double hours;
    private String project;
    private String task;
    private Integer day;
}
