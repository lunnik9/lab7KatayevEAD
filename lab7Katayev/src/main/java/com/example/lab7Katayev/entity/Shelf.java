package com.example.lab7Katayev.entity;
import javax.persistence.*;
import java.util.List;

@Entity
public class Shelf implements Storage{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    @OneToMany(mappedBy = "storage_id", fetch = FetchType.LAZY)
    private List<Book> books;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Storage getStorage() {
        return this;
    }
}
