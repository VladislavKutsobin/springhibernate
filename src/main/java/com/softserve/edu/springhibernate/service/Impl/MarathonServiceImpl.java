package com.softserve.edu.springhibernate.service.Impl;

import com.softserve.edu.springhibernate.model.Marathon;
import com.softserve.edu.springhibernate.repository.MarathonRepository;
import com.softserve.edu.springhibernate.service.MarathonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarathonServiceImpl implements MarathonService {

    private final MarathonRepository marathonRepository;

    @Autowired
    public MarathonServiceImpl(MarathonRepository marathonRepository) {
        this.marathonRepository = marathonRepository;
    }

    @Override
    public List<Marathon> getAll() {
        return marathonRepository.findAll();
    }

    @Override
    public Marathon getMarathonById(Long id) {
        return marathonRepository.getOne(id);
    }

    @Override
    public Marathon createOrUpdate(Marathon marathon) {
        return marathonRepository.saveAndFlush(marathon);
    }

    @Override
    public void deleteMarathonById(Long id) {
        marathonRepository.deleteById(id);
    }
}
