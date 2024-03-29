package com.corejava.chapter5.arrayList;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        var staff = new ArrayList<Employee>();

        staff.add(new Employee("Carl Cracker", 75000, 1989, 12, 15));
        staff.add(new Employee("Harry Hacker", 50000, 1989, 12, 15));
        staff.add(new Employee("Tony Tester", 40000, 1989, 12, 15));

        //raise everyone's salary by 5%
        for (Employee e : staff) {
            e.raiseSalary(5);
        }

        //print out information about all Employee staff
        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary() + ", hireDay=" + e.getHireDay());
        }
    }
}
