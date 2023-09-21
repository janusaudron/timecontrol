package com.janusaudron.timecontrol.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.janusaudron.timecontrol.model.Project;

@Repository
    public interface ProjectRepository extends MongoRepository < Project, Integer > {
    }
