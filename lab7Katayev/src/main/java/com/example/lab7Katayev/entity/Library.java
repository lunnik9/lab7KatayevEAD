package com.example.lab7Katayev.entity;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

public class Library {

    @OneToMany(mappedBy = "user_id",fetch = FetchType.LAZY)
    private List<User>users;
    @OneToMany(mappedBy = "storage_id",fetch = FetchType.LAZY)
    private List<Storage> storages;
}
