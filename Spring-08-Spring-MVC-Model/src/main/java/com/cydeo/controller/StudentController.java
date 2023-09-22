package com.cydeo.controller;

import com.cydeo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//
@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model){
        //model methods
        model.addAttribute("name", "Cydeo");
        model.addAttribute("course", "MVC");

        String subject = "Collection";
        model.addAttribute("subject", subject);

        //create random studentId(0-1000) and show it in your UI
        Random random = new Random();
        int student_id = random.nextInt(1001);
        model.addAttribute("student_id", student_id);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(7);
        numbers.add(10);

        model.addAttribute("numbers", numbers);
        model.addAttribute("numbers_4", numbers.get(0));

        Student student = new Student(1, "Mike", "Smith");
        model.addAttribute("Student", student);

        return "student/welcome";
    }


//    @RequestMapping("/ozzy")
//    public String homePage2(Model model){
//        return "student/welcome";
//    }




}
