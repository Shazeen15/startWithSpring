package com.example.startwithspring;

import com.example.startwithspring.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class StartWithSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartWithSpringApplication.class, args);
    }

    @GetMapping
    public List<Student> hello() {
        return List.of(new Student(1L, "Shazeen", "shazeen@gmail.com", LocalDate.of(1993, 06, 15), 28));
    }
}
