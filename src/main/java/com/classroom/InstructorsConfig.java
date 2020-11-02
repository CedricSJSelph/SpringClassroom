package com.classroom;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class InstructorsConfig {

    @Bean(name = "tuesdayInstructors")
    public Instructors delTechTuesdayInstructors(){
        List<Instructor> tuesInstruc= new ArrayList<>();

        tuesInstruc.add(new Instructor(100l, "Zan"));
        tuesInstruc.add(new Instructor(101l, "Brian"));

        return new Instructors(tuesInstruc);
    }

    @Bean(name = "thursdayInstructors")
    public Instructors delTechThursdayInstructors(){
        List<Instructor> thursInstruc= new ArrayList<>();

        thursInstruc.add(new Instructor(102l, "Kaleb"));
        thursInstruc.add(new Instructor(103l, "Tutor"));

        return new Instructors(thursInstruc);
    }

    @Primary
    @Bean(name ="allInstructors")
    public Instructors instructors(){
        Instructors instructors = new Instructors(new ArrayList<>());

        instructors.add(new Instructor(100l, "Zan"));
        instructors.add(new Instructor(101l, "Brian"));
        instructors.add(new Instructor(102l, "Kaleb"));
        instructors.add(new Instructor(103l, "Tutor"));


        return instructors;
    }
}
