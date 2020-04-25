package com.example.lab7Katayev.service;

import com.example.lab7Katayev.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void createUser(User user);

    void updateUser(Long id, User user);
}
