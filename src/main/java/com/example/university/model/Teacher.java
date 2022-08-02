package com.example.university.model;

import javax.persistence.*;


@Entity
@Table(name = "teachers")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacher_id", nullable = false)
    private long id;
    private String name;

    public Teacher(long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    private String surname;

    public Teacher() {

    }
    @OneToOne
    @JoinColumn(name = "teacher_id")
    private Faculty faculty;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
