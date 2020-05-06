package com.example.lab7Katayev.entity;

import lombok.Getter;

import lombok.Setter;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
public class Library {

    private String name;


    @OneToMany(mappedBy = "user_id", fetch = FetchType.LAZY)
    private List<User> users;
    @OneToMany(mappedBy = "storage_id", fetch = FetchType.LAZY)
    private List<Storage> storages;
}
