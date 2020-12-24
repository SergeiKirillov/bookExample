package com.sergeiakir.horstman;

import java.util.ArrayList;

/**
 * В этой программе демонстрируется применение класса ArrayListTest
 * @version  1.11
 * @author  Cay Horstmann
 * @see "Java. Библиотека профессионала, том 1. Основы. стр 237"
 */

public class List_5_11_237 {
    public static void main(String[] args) {

        ArrayList<Employee> staff = new ArrayList<>();

        staff.add(new Employee("Alice Adams",75000,1987,12,15));
        staff.add(new Employee("Carl Cracker", 80000,1987,12,15));
        staff.add(new Employee("Bob Brandson",50000,1989,10,1));

        for (Employee em: staff) {
            em.raiseSalary(5);
        }

        for (Employee em: staff) {
            System.out.println("name="+ em.getName() + ", salary="+ em.getSalary()+", hireday="+ em.getHireDay());
        }
    }
}
