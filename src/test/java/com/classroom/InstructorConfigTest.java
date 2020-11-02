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
public class InstructorConfigTest {

    @Autowired
    InstructorsConfig config;

    @Autowired
    @Qualifier("tuesdayInstructors")
    Instructors TInstructors;

    @Autowired
    @Qualifier("thursdayInstructors")
    Instructors TRInstructors;

    @Autowired
    @Qualifier("allInstructors")
    Instructors allInstructors;

    @Test
    public void testTuesdayInstructors(){
        Assert.assertEquals("Zan", TInstructors.findById(100).getName());
        Assert.assertEquals("Brian", TInstructors.findById(101).getName());
    }

    @Test
    public void testThursdayInstructors(){
        Assert.assertEquals("Kaleb", TRInstructors.findById(102).getName());
        Assert.assertEquals("Tutor", TRInstructors.findById(103).getName());
    }

    @Test
    public void testAllInstructors(){
        Assert.assertEquals("Zan", allInstructors.findById(100).getName());
        Assert.assertEquals("Brian", allInstructors.findById(101).getName());
        Assert.assertEquals("Kaleb", allInstructors.findById(102).getName());
        Assert.assertEquals("Tutor", allInstructors.findById(103).getName());
    }

}
