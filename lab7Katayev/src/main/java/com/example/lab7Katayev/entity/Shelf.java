package com.example.lab7Katayev.entity;
import io.swagger.annotations.Api;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Api(value = "implementation of storage that keeps books in simple list")
public class Shelf implements Storage{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Getter
    @Setter
    private String name;
    @OneToMany(mappedBy = "storage_id", fetch = FetchType.LAZY)
    private List<Book> books;


    @Override
    public Storage getStorage() {
        return this;
    }
}
