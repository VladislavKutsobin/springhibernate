package com.softserve.edu.springhibernate.service;

import com.softserve.edu.springhibernate.model.Marathon;

import java.util.List;

public interface MarathonService {
    List<Marathon> getAll();
    Marathon getMarathonById(Long id);
    Marathon createOrUpdate(Marathon marathon);
    void deleteMarathonById(Long id);
}
