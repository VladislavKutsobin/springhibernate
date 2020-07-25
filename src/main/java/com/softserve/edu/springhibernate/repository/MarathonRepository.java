package com.softserve.edu.springhibernate.repository;

import com.softserve.edu.springhibernate.model.Marathon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarathonRepository extends JpaRepository<Marathon, Long> {
}
