package com.softserve.edu.springhibernate.service.Impl;

import com.softserve.edu.springhibernate.model.Marathon;
import com.softserve.edu.springhibernate.model.User;
import com.softserve.edu.springhibernate.repository.UserRepository;
import com.softserve.edu.springhibernate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public User createOrUpdateUser(User user) {
        userRepository.saveAndFlush(user);
        return user;
    }

    @Override
    public List<User> getAllByRole(String role) {
        List<User> resultList = new ArrayList<>();
        List<User> allRolsList = this.getAll();
        for (User user : allRolsList) {
            if (user.getRole().equals(role)) {
                resultList.add(user);
            }
        }
        return resultList;
    }

    @Override
    public boolean addUserToMarathon(User user, Marathon marathon) {
        return marathon.getUsers().add(user);
    }
}
