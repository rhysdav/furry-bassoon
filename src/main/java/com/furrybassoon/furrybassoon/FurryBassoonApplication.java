package com.furrybassoon.furrybassoon;

import com.furrybassoon.furrybassoon.modal.NoteRepository;
import com.furrybassoon.furrybassoon.modal.NotebookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FurryBassoonApplication {

    public static void main(String[] args) {
        SpringApplication.run(FurryBassoonApplication.class, args);
    }
}
