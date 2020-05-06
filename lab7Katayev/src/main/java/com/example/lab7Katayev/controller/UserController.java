package com.example.lab7Katayev.controller;

import com.example.lab7Katayev.entity.Book;
import com.example.lab7Katayev.entity.Storage;
import com.example.lab7Katayev.entity.User;
import com.example.lab7Katayev.repository.BookRepository;
import com.example.lab7Katayev.repository.UserRepository;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Api(value="user controller class")
public class UserController {

    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Long id) {
        return userRepository.getOne(id);
    }

    @PostMapping("")
    public User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }

}
