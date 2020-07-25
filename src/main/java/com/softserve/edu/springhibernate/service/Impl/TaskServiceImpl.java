package com.softserve.edu.springhibernate.service.Impl;

import com.softserve.edu.springhibernate.model.Sprint;
import com.softserve.edu.springhibernate.model.Task;
import com.softserve.edu.springhibernate.repository.TaskRepository;
import com.softserve.edu.springhibernate.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public boolean addTaskToSprint(Task task, Sprint sprint) {
        return sprint.getTasks().add(task);
    }

    @Override
    public Task getTaskById(Long id) {
        return taskRepository.getOne(id);
    }
}
