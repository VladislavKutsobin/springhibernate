package com.softserve.edu.springhibernate.service;

import com.softserve.edu.springhibernate.model.Marathon;
import com.softserve.edu.springhibernate.model.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User getUserById(Long id);
    User createOrUpdateUser(User user);
    List<User> getAllByRole(String role);
    boolean addUserToMarathon(User user, Marathon marathon);
}
