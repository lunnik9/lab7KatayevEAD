package com.example.lab7Katayev.controller;

import com.example.lab7Katayev.entity.Storage;
import com.example.lab7Katayev.repository.StorageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/storage")
public class StorageController {

    @Autowired
    private StorageRepository storageRepository;

    @GetMapping("/{id}")
    public Storage getStorageById(@PathVariable("id") Long id) {
        return storageRepository.getOne(id);
    }

    @DeleteMapping("/{id}")
    public void deleteStorageById(@PathVariable("id") Long id) {
        storageRepository.delete(
                storageRepository.getOne(id)
        );
    }

    @PostMapping("")
    public Storage addStorage(@RequestBody Storage storage) {
        return storageRepository.save(storage);
    }
}
