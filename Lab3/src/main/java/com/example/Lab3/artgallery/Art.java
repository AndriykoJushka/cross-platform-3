package com.example.Lab3.artgallery;

import jakarta.persistence.Embeddable;

@Embeddable
public class Art {
    public Art() {

    }

    public String getArtName() {
        return ArtName;
    }

    private String ArtName;

    public Art(String name){
        ArtName = name;
    }
}
