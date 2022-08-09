package com.example.university.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@ToString
@Entity
@Table(name = "faculties")
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToOne(mappedBy = "faculty", cascade = CascadeType.ALL)
    private Teacher teacher;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "faculties")
    private List<Student> students;


    public void addStudentToFaculty(Student student) {
        if (students == null) {
            students = new ArrayList<>();
        }
        students.add(student);
        student.setFaculties(this);
    }

    public Faculty() {

    }

    public Faculty(String name, Teacher teacher, List<Student> students) {
        this.name = name;
        this.teacher = teacher;
        this.students = students;
    }
}
