package com.janusaudron.timecontrol.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.janusaudron.timecontrol.model.Holiday;
import com.janusaudron.timecontrol.model.Project;
import com.janusaudron.timecontrol.model.Task;
import com.janusaudron.timecontrol.repository.HolidayRepository;

@Service
public class TimeControlService {

    @Autowired
    private HolidayRepository holidayRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<Holiday> getHolidays(Integer year) {
        return holidayRepository.findItemsByYear(year);        
    }

    public List<Project> getProjects() {
        return mongoTemplate.findAll(Project.class);
    }

    public List<Task> getTasks() {
        return mongoTemplate.findAll(Task.class);
    }


    
}
