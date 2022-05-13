package com.example.startwithspring.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        var me = new Student(1L, "Shazeen", "shazeen@gmail.com", LocalDate.of(1993, 06, 15), 28);

        return List.of(me);
    }
}
