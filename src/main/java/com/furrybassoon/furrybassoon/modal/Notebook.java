package com.furrybassoon.furrybassoon.modal;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "notebooks")
public class Notebook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notebook_id;
    @OneToMany
    private Set<Note> notes;
    private String notebook_name;

    public Notebook() {}

    public Notebook(String name, Set<Note> notes) {
        this.notebook_name = name;
        this.notes = notes;
    }

    public Long getNotebook_id() {
        return notebook_id;
    }

    public Set<Note> getNotes() {
        return notes;
    }

    public String getNotebook_name() {
        return notebook_name;
    }

    public void addNoteToNotebook(Note note) {

    }

    public void removeNoteFromNotebook(Note note) {

    }
}
