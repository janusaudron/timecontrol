package com.janusaudron.timecontrol.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document
@Getter @Setter
public class Task {
    private String name;
    
}
