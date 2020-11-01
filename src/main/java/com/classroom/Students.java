package com.classroom;

import java.util.List;

public class Students extends People<Student>{

    public Students(List<Student> persons) {
        super(persons);
    }
}
