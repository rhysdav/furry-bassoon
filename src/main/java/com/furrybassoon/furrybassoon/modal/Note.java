package com.furrybassoon.furrybassoon.modal;

import javax.persistence.*;

@Entity(name = "notes")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String title;
    public String body;

    public Note(){};

    public Note(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}