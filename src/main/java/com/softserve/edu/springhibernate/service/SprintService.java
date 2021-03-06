package com.softserve.edu.springhibernate.service;

import com.softserve.edu.springhibernate.model.Marathon;
import com.softserve.edu.springhibernate.model.Sprint;

import java.util.List;

public interface SprintService {
    List<Sprint> getSprintByMarathonId(Long id);
    boolean addSprintToMarathon(Sprint sprint, Marathon marathon);
    boolean updateSprint(Sprint sprint);
    Sprint getSprintById(Long id);
}
