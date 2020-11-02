package com.classroom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class Alumni {

    @Autowired
    @Qualifier("previousCohort")
    Classroom prevCohort;

    List<Instructor> instructors = prevCohort.getInstructors();
    List<Student> students = prevCohort.getStudents();

    @PostConstruct
    public void executeBootcamp(){
        int totalNumHours = 1200;
        instructors.get(0).lecture(students, totalNumHours);
    }

    public Classroom getPrevCohort() {
        return prevCohort;
    }

    public List<Instructor> getInstructors() {
        return instructors;
    }

    public List<Student> getStudents() {
        return students;
    }
}
