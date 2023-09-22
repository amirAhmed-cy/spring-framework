package com.cydeo.controller;

import com.cydeo.enems.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//
@Controller
public class MentorController {

    @RequestMapping("/list")
    public String mentorData(Model model){

       // Mentor mentor = new Mentor("First Name", "Last Name", 45, Gender.MALE);
        Mentor mentor1 = new Mentor("Mike", "Smith", 45, Gender.MALE);
        Mentor mentor2 = new Mentor("Tom", "Hanks", 65, Gender.MALE);
        Mentor mentor3 = new Mentor("Ammy", "Bryan", 25, Gender.FEMALE);

        List<Mentor> studentMentors = new ArrayList<>();
        studentMentors.addAll(Arrays.asList(mentor1, mentor2, mentor3));

//        studentMentors.add(mentor1);
//        studentMentors.add(mentor2);
//        studentMentors.add(mentor3);
//        studentMentors.add(new Mentor("Mike", "Smith", 45, Gender.MALE));
//        studentMentors.add(new Mentor("Tom", "Hanks", 65, Gender.MALE));
//        studentMentors.add(new Mentor("Ammy", "Bryan", 25, Gender.FEMALE));

        model.addAttribute("mentors", studentMentors);

        return "student/mentorData";

    }




}
