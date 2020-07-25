package com.softserve.edu.springhibernate.service;

import com.softserve.edu.springhibernate.model.Sprint;
import com.softserve.edu.springhibernate.model.Task;

public interface TaskService {
    boolean addTaskToSprint(Task task, Sprint sprint);
    Task getTaskById(Long id);
}
