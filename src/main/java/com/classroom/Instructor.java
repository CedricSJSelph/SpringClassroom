package com.classroom;

public class Instructor extends Person implements Teacher {

    public Instructor(){
        this(null, null);
    }

    public Instructor(Long ID, String name){
        super(ID, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        Integer numOfStudents =0;
        for(Learner s:learners){
        numOfStudents += 1;
        }

        for(Learner s:learners){
            s.learn(numberOfHours/numOfStudents);
        }
    }
}
