package com.example.university.service;


import com.example.university.model.Teacher;


import java.util.List;
import java.util.Optional;


public interface TeacherService {
    List<Teacher> findAll();

    Optional<Teacher> findById(Long id);

    Teacher saveTeacher(Teacher teacher);

    Teacher updateTeacher(Teacher teacher);

    void deleteTeacher(Long id);
}
