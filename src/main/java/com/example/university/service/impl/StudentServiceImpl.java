package com.example.university.service.impl;

import com.example.university.model.Student;
import com.example.university.repository.StudentRepository;
import com.example.university.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAllStudents() {
//        log.info("IN StudentServiceImpl getAll");
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> findById(Long id) {
//        log.info("IN StudentServiceImpl findByID {}", id);
        return studentRepository.findById(id);
    }

    @Override
    public Student saveStudent(Student student) {
//        log.info("IN StudentServiceImpl save {}", student);
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
//        log.info("IN StudentServiceImpl update {}", student);
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
//        log.info("IN StudentServiceImpl deleteByID {}", id);
        studentRepository.deleteById(id);
    }
}
