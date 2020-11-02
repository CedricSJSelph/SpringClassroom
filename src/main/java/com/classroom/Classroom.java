package com.classroom;

import java.util.List;

public class Classroom {

    private List<Instructor> Instructors;
    private List<Student> Students;

    public Classroom(List<Instructor> persons, List<Student> students){
        this.Instructors = persons;
        this.Students = students;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(Students, numberOfHours);
    }

    public List<Instructor> getInstructors() {
        return Instructors;
    }

    public List<Student> getStudents() {
        return Students;
    }
}
