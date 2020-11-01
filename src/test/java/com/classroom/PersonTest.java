package com.classroom;

import junit.framework.Assert;

import org.junit.jupiter.api.Test;


public class PersonTest {

    @Test
    public void createPersonTest(){
        Person ced = new Person(1L,"Cedric");

        long expectedID = ced.getID();
        Assert.assertEquals(1L, expectedID);
        Assert.assertEquals("Cedric", ced.getName());
    }
}
