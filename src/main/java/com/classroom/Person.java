package com.classroom;

public class Person {

    private final Long ID;
    private String name;

    public Person(){
       this(null, null);
    }

    public Person(Long id, String name){
        ID = id;
        this.name = name;
    }

    public Long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
