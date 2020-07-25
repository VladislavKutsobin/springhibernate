package com.softserve.edu.springhibernate.service.Impl;

import com.softserve.edu.springhibernate.model.Marathon;
import com.softserve.edu.springhibernate.model.Sprint;
import com.softserve.edu.springhibernate.repository.MarathonRepository;
import com.softserve.edu.springhibernate.repository.SprintRepository;
import com.softserve.edu.springhibernate.service.SprintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class SprintServiceImpl implements SprintService {

    private final SprintRepository sprintRepository;
    private final MarathonRepository marathonRepository;

    @Autowired
    public SprintServiceImpl(SprintRepository sprintRepository, MarathonRepository marathonRepository) {
        this.sprintRepository = sprintRepository;
        this.marathonRepository = marathonRepository;
    }

    @Override
    public List<Sprint> getSprintByMarathonId(Long id) {
        return (List<Sprint>) marathonRepository.getOne(id).getSprints();
    }

    @Override
    public boolean addSprintToMarathon(Sprint sprint, Marathon marathon) {
        boolean resultCheck = marathon.getSprints().add(sprint);
        if (resultCheck) {
            sprintRepository.saveAndFlush(sprint);
            return true;
        } else return false;
    }

    @Override
    public boolean updateSprint(Sprint sprint) {
        sprintRepository.saveAndFlush(sprint);
        return true;
    }

    @Override
    public Sprint getSprintById(Long id) {
        return sprintRepository.getOne(id);
    }
}
