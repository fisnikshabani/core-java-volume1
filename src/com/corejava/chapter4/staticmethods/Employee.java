package com.corejava.chapter4.staticmethods;

public class Employee {

    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.id = 0;
    }

    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public int getId() {
        return id;
    }

    public void setId() {
       id = nextId;
       nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

}
