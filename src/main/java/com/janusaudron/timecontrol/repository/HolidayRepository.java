package com.janusaudron.timecontrol.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.janusaudron.timecontrol.model.Holiday;

@Repository
    public interface HolidayRepository extends MongoRepository < Holiday, Integer > {

        @Query("{year:'?0'}")
        List<Holiday> findItemsByYear(Integer year);
        
    }
