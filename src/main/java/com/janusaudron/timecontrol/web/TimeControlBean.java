package com.janusaudron.timecontrol.web;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.RequestScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.janusaudron.timecontrol.business.TimeControlService;
import com.janusaudron.timecontrol.model.Holiday;
import com.janusaudron.timecontrol.model.Project;
import com.janusaudron.timecontrol.model.Task;
import com.janusaudron.timecontrol.model.TimeEntry;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.java.Log;

//@ManagedBean(name = "timeControlBean")
@Component(value = "timeControlBean")
@RequestScoped
@Getter @Setter
@Log
public class TimeControlBean {

    private TimeEntry timeEntry;
    private List<Project> projects;
    private List<Task> tasks;
    private List<Holiday> holidays;
    private List<TimeEntry> timeEntries;

    @Autowired
    private TimeControlService service;

    @PostConstruct
	public void init() {

        log.info("Entroooo******");

        timeEntries = new ArrayList<>(); //service.getTimeEntries();
        timeEntry = new TimeEntry();
        timeEntries.add(timeEntry);


        projects = service.getProjects();
        tasks = service.getTasks();
        holidays = service.getHolidays(Calendar.getInstance().get(Calendar.YEAR));
    }

    public void save() {
        log.info("Entroooo2******");
        projects = service.getProjects();
        
    }

    
}