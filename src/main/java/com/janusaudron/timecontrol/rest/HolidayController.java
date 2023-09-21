package com.janusaudron.timecontrol.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.janusaudron.timecontrol.model.Holiday;
import com.janusaudron.timecontrol.model.Project;
import com.janusaudron.timecontrol.model.Task;
import com.janusaudron.timecontrol.repository.HolidayRepository;

import lombok.extern.java.Log;

@RestController
@RequestMapping(value = "/holiday")
@Log
public class HolidayController {

    @Autowired
    private HolidayRepository repository;

	@Autowired
	private MongoTemplate mongoTemplate;

    @RequestMapping(value = "", method = RequestMethod.GET)
	public List<Holiday> getAllHolidays() {
		log.info("Getting all Employees.");
		return repository.findAll();
	}

    @RequestMapping(value = "/create", method = RequestMethod.POST)
	public Holiday add(@RequestBody Holiday model) {
		log.info("Saving Employee.");
		return repository.save(model);
	}

	@RequestMapping(value = "/init", method = RequestMethod.GET)
	public void init() {
		log.info("Init data.");
		List<Project> projects = new ArrayList<>();

		Project project = new Project();
		project.setId(111111);
		projects.add(project);

		project = new Project();
		project.setId(222222);
		projects.add(project);

		project = new Project();
		project.setId(333333);
		projects.add(project);

		List<Task> tasks = new ArrayList<>();

		Task task = new Task();
		task.setName("1.1");
		tasks.add(task);

		task = new Task();
		task.setName("1.2");
		tasks.add(task);

		task = new Task();
		task.setName("1.3");
		tasks.add(task);

		mongoTemplate.insertAll(tasks);
		mongoTemplate.insertAll(projects);
		
	}
    
}
