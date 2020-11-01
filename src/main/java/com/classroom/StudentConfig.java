package com.classroom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents(){

        List<Student> students= new ArrayList<>();

        students.add(new Student(1l, "Cedric"));
        students.add(new Student(2l, "Lolu"));
        students.add(new Student(3l, "Apoorva"));
        students.add(new Student(4l, "Stephen"));

        return new Students(students);
    }

    @Bean
    public Students previousStudents(){
        List<Student> students= new ArrayList<>();

        students.add(new Student(5l, "Charu"));
        students.add(new Student(6l, "Robert"));
        students.add(new Student(7l, "user iphone 83"));
        students.add(new Student(8l, "Jessica"));

        return new Students(students);
    }

}
