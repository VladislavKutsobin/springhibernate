package com.softserve.edu.springhibernate.repository;

import com.softserve.edu.springhibernate.model.Progress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgressRepository extends JpaRepository<Progress, Long> {
}
