package com.softserve.edu.springhibernate.repository;

import com.softserve.edu.springhibernate.model.Sprint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SprintRepository extends JpaRepository<Sprint, Long> {
}
