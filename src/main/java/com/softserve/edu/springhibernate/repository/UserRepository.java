package com.softserve.edu.springhibernate.repository;

import com.softserve.edu.springhibernate.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
