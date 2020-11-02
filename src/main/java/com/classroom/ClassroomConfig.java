package com.classroom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ClassroomConfig {

    @Bean(name = "currentCohort")
    public Classroom currentCohort(){

        List<Instructor> instructors = new ArrayList<>();
        List<Student> students = new ArrayList<>();

        instructors.add(new Instructor(100l, "Zan"));
        instructors.add(new Instructor(101l, "Brian"));

        students.add(new Student(1l, "Cedric"));
        students.add(new Student(2l, "Lolu"));
        students.add(new Student(3l, "Apoorva"));
        students.add(new Student(4l, "Stephen"));

        return new Classroom(instructors, students);
    }

    @Bean(name = "previousCohort")
    public Classroom previousCohort(){

        List<Instructor> instructors = new ArrayList<>();
        List<Student> students = new ArrayList<>();

        instructors.add(new Instructor(102l, "Kaleb"));
        instructors.add(new Instructor(103l, "Tutor"));

        students.add(new Student(5l, "Charu"));
        students.add(new Student(6l, "Robert"));
        students.add(new Student(7l, "user iphone 83"));
        students.add(new Student(8l, "Jessica"));

        return new Classroom(instructors, students);
    }
}
