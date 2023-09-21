package com.janusaudron.timecontrol.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document
@Getter @Setter
public class Holiday {

    @Id
    private Integer id;
    private Integer day;
    private Integer month;
    private Integer year;
    private String dayOfWeek; 
}
