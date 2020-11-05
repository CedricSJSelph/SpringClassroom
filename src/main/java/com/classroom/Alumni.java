package com.classroom;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Alumni {

    final
    Classroom prevCohort;


    public Alumni(@Qualifier("previousCohort") Classroom prevCohort) {
        this.prevCohort = prevCohort;
    }

    @PostConstruct
    public void executeBootcamp(){
        int numberOfInstructors = prevCohort.getInstructors().size();
        int numberOfStudents = prevCohort.getStudents().size();

        double numberOfHoursToTeachEachStudent = 1200;
        double numberOfHoursToTeach = numberOfHoursToTeachEachStudent * numberOfStudents; //1200*4 = 4800
        double numberOfHoursPerInstructor = numberOfHoursToTeach / numberOfInstructors; //4800/2 = 2400

        for(Instructor teach: prevCohort.getInstructors()){
            for(Student stud: prevCohort.getStudents()){
                teach.teach(stud, numberOfHoursPerInstructor);
            }
        }
    }

    public Classroom getPrevCohort() {
        return prevCohort;
    }

}
