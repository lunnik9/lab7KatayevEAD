package com.example.lab7Katayev.entity;

import javax.persistence.*;
import java.sql.Time;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String ISBN;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Time getExpirationDate() {
        return ExpirationDate;
    }

    public void setExpirationDate(Time expirationDate) {
        ExpirationDate = expirationDate;
    }

    public String getStorageId() {
        return StorageId;
    }

    public void setStorageId(String storageId) {
        StorageId = storageId;
    }

    private String author;
    private String name;
    private String description;
    private Time ExpirationDate;
    private String StorageId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", insertable = false)
    private User user;


}
