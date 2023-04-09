package com.corejava.chapter5.abstractClasses;

public abstract class Person {

    public String name;
    public abstract String getDescription();

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
