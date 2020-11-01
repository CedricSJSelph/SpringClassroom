package com.classroom;

import junit.framework.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class classRoomTests {

    @Test
    public void teachAllTest(){
        List<Student> students = new ArrayList<Student>();
        List<Instructor> teacher = new ArrayList<Instructor>();

        Instructor zan = new Instructor(0L, "Zan");
        teacher.add(zan);

        Student ced = new Student(1l, "Cedric");
        Student lol = new Student(2L, "Lolo");
        students.add(ced);
        students.add(lol);

        Classroom clazz = new Classroom(teacher, students);

        clazz.hostLecture(zan, 2);

        Assert.assertEquals(1.0, ced.getTotalStudyTime());
        Assert.assertEquals(1.0, lol.getTotalStudyTime());
    }
}
