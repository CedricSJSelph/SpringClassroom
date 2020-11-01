package com.classroom;

public class Student extends Person implements Learner{

    public double totalStudyTime = 0;

    public Student(){
        this(null, null);
    }

    public Student(Long id, String name){
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
