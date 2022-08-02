package com.example.university.service;

import com.example.university.model.Student;


import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> findAllStudents();

    Optional<Student> findById(Long id);

    Student saveStudent(Student student);

    Student updateStudent(Student student);

    void deleteStudent(Long id);

}
