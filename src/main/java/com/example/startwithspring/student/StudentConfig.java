package com.example.startwithspring.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.FEBRUARY;
import static java.time.Month.JUNE;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            var me = new Student("Shazeen", "shazeen@gmail.com", LocalDate.of(1993, JUNE, 15), 28);
            var jamile = new Student("Jamile", "jamile@gmail.com", LocalDate.of(1993, FEBRUARY, 03), 28);

            studentRepository.saveAll(List.of(me, jamile));
        };
    }
}
