package com.example.Lab3.artgallery;

import jakarta.persistence.Embeddable;

@Embeddable
public class Author {
    private String Name;
    public Author(String name){
        Name = name;
    }

    public Author() {

    }

    public String getName() {
        return Name;
    }
}
