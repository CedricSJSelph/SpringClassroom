package com.classroom;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class alumniTest {

    @Autowired
    Alumni clazz;

    @Test
    public void teachAlumTest(){
        //All students should have 4800 of hours
        for(Student stud:clazz.getPrevCohort().getStudents()){
            Assert.assertEquals(4800, (int)stud.getTotalStudyTime());
        }
    }

    @Test
    public void classStudentSizeTest(){
        int expectedSize = clazz.getPrevCohort().getStudents().size();
        Assert.assertEquals(4, expectedSize);
    }

    @Test
    public void classInstructorSizeTest(){
        int expectedSize = clazz.getPrevCohort().getInstructors().size();
        Assert.assertEquals(2, expectedSize);
    }

}
