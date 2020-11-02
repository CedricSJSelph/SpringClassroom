package com.classroom;

import org.junit.Assert;
import org.junit.Test;
import com.classroom.Alumni;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class alumniTest {

    @Autowired
    @Qualifier("Alumni")
    Classroom clazz;

    @Test
    public void teachAlumTest(){
        Assert.assertEquals("Kaleb", clazz.getInstructors().get(0));
    }
}
