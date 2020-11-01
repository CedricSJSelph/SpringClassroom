package com.classroom;

import java.util.Iterator;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType>{

    public List<PersonType> personList;

    public People(List<PersonType> persons){
        this.personList = persons;
    }

    public void add(PersonType person){
        this.personList.add(person);
    }

    public void remove(PersonType person){
        this.personList.remove(person);
    }

    public int size(){
        return this.personList.size();
    }

    public void clear(){
        this.personList.clear();
    }

    public void addAll(){
        for(PersonType p:this){
            personList.add(p);
        }
    }

    public Person findById(long id){
        Person person = new Person();
        for(PersonType p:personList){
            if(p.getID() == id){
                return p;
            }
        }
        return person;
    }

    public List<PersonType> findAll(){
        return personList;
    }

    @Override
    public Iterator<PersonType> iterator() {
        return personList.iterator();
    }
}
