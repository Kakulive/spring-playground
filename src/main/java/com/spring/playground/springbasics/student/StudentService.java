package com.spring.playground.springbasics.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

//    public List<Student> getStudents() {
//        return List.of(new Student(
//                1L,
//                "Janusz",
//                "janusz.kowalski@gmail.com",
//                LocalDate.of(2000, Month.JANUARY, 5),
//                21
//        ));
//    }
}
