package com.classroom;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentConfigTest {

    @Autowired
    StudentConfig config;

    @Autowired
    @Qualifier("students")
    Students currentStudents;

    @Autowired
    @Qualifier("previousStudents")
    Students previousStudents;

    @Test
    public void testCurrentStudents(){
        Assert.assertEquals("Cedric", currentStudents.findById(1l).getName());
        Assert.assertEquals("Lolu", currentStudents.findById(2l).getName());
        Assert.assertEquals("Apoorva", currentStudents.findById(3l).getName());
        Assert.assertEquals("Stephen", currentStudents.findById(4l).getName());
    }

    @Test
    public void testPastStudents(){
        Assert.assertEquals("Charu", previousStudents.findById(5l).getName());
        Assert.assertEquals("Robert", previousStudents.findById(6l).getName());
        Assert.assertEquals("user iphone 83", previousStudents.findById(7l).getName());
        Assert.assertEquals("Jessica", previousStudents.findById(8l).getName());
    }
}
