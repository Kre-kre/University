package com.example.university.controller;

import com.example.university.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
    @RequestMapping("/")
    public String getStart() {
        return "view_for_all";
    }

    @RequestMapping("/student_info")
    public String studentInfo(Model model){

//        Student student = stud.getId();
//        model.addAttribute("student",student);  -> get.id student
        return "view_for_student";
    }
    @RequestMapping("/teacher_info")
    public String teacherInfo(){
        return "view_for_teacher";
    }


}
