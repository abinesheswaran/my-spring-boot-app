package com.example.demo.rest;

import com.example.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentRestController {
    private List<Student> students = new ArrayList<>();

    @PostConstruct
    public void createDummyData() {
        students.add(new Student("abinesh", 1, 5));
        students.add(new Student("chitra", 2, 21));
        students.add(new Student("abitra", 3, 0));
    }

    @GetMapping("/")
    public List<Student> getAllStudents() {
        return students;
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Integer id) {
        return students.get(id);
    }
}
