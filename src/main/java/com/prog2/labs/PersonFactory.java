package com.prog2.labs;

public class PersonFactory {

    private int idCounter;

    public Person createPerson(String name) {
        // todo: implement
        Person p1 = new Person(idCounter, name);
        idCounter++;
        return p1;
    }
}
