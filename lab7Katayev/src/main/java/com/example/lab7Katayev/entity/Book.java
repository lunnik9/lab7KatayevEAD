package com.example.lab7Katayev.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Getter
@Setter

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String ISBN;


    private String author;
    private String name;
    private String description;
    private Time ExpirationDate;
    private String StorageId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", insertable = false)
    private User user;


}
