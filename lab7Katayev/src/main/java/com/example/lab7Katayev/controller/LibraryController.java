package com.example.lab7Katayev.controller;

import com.example.lab7Katayev.entity.Library;
import com.example.lab7Katayev.entity.Storage;
import com.example.lab7Katayev.entity.User;
import com.example.lab7Katayev.repository.LibraryRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/library")
@Api(value = "library controller class")
public class LibraryController {
    @Autowired
    private LibraryRepository libraryRepository;

    @GetMapping("")
    public String getName() {
        return libraryRepository.getOne((long) 0).getName();
    }

    @GetMapping("/name/{name}")
    public void setName(@PathVariable("name") String name) {
        Library lib = libraryRepository.getOne((long) 0);
        lib.setName(name);
        libraryRepository.save(lib);
    }

    @GetMapping("/storages/get")
    public List<Storage> getStorages() {
        return libraryRepository.getOne((long) 0).getStorages();
    }

    @GetMapping("/users/get")
    public List<User> getUsers() {
        return libraryRepository.getOne((long) 0).getUsers();
    }
}
