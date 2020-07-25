package com.softserve.edu.springhibernate.repository;

import com.softserve.edu.springhibernate.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
