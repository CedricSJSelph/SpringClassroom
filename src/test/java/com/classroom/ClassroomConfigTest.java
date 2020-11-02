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
public class ClassroomConfigTest {

    @Autowired
    ClassroomConfig config;

    @Autowired
    @Qualifier("currentCohort")
    Classroom curCohort;

    @Autowired
    @Qualifier("previousCohort")
    Classroom preCohort;

    @Test
    public void testCurrentCohort(){

        Assert.assertEquals("Zan", curCohort.getInstructors().get(0).getName());
        Assert.assertEquals("Brian", curCohort.getInstructors().get(1).getName());

        Assert.assertEquals("Cedric", curCohort.getStudents().get(0).getName());
        Assert.assertEquals("Lolu", curCohort.getStudents().get(1).getName());
        Assert.assertEquals("Apoorva", curCohort.getStudents().get(2).getName());
        Assert.assertEquals("Stephen", curCohort.getStudents().get(3).getName());
    }

    @Test
    public void testPreviousCohort(){

        Assert.assertEquals("Kaleb", preCohort.getInstructors().get(0).getName());
        Assert.assertEquals("Tutor", preCohort.getInstructors().get(1).getName());

        Assert.assertEquals("Charu", preCohort.getStudents().get(0).getName());
        Assert.assertEquals("Robert", preCohort.getStudents().get(1).getName());
        Assert.assertEquals("user iphone 83", preCohort.getStudents().get(2).getName());
        Assert.assertEquals("Jessica", preCohort.getStudents().get(3).getName());

        Assert.assertEquals("102", preCohort.getInstructors().get(0).getID().toString());
        Assert.assertEquals("5", preCohort.getStudents().get(0).getID().toString());
    }

}
