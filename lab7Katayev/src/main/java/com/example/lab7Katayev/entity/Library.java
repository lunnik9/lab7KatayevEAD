package com.example.lab7Katayev.entity;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

public class Library {

    private String name;

    public List<User> getUsers() {
        return users;
    }

    public List<Storage> getStorages() {
        return storages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "user_id", fetch = FetchType.LAZY)
    private List<User> users;
    @OneToMany(mappedBy = "storage_id", fetch = FetchType.LAZY)
    private List<Storage> storages;
}
