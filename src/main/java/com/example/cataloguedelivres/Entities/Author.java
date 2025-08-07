package com.example.cataloguedelivres.Entities;
import jakarta.persistence.*;

import java.util.List;


@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String biography;

    //@OneToMany(mappedBy = "author")
    //private List<Book> books;

    public Author(){}

    public Author(Long id, String name, String biography , List<Book> books) {
        this.id = id;
        this.name = name;
        this.biography = biography;
        //this.books = books;
    }

    //public List<Book> getBooks() {
     //   return books;
    //}

    //public void setBooks(List<Book> books) {
//        this.books = books;
   // }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
