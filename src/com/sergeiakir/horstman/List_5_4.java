package com.sergeiakir.horstman;

/**
 * В этой программе демонстрируется применение абстрактных классов
 * @version  1.01
 * @author  Cay Horstmann
 * @see "Java. Библиотека профессионала, том 1. Основы. стр 215"
 */

public class List_5_4 {
    public static void main(String[] args) {
        Person[] people = new Person[2];

        people[0] = new Employee("Harry Hacker", 50000, 1989,10,1);
        people[1] = new Student("Marry Morris", "computer science");

        for (Person p: people) {
            System.out.println(p.getName()+","+p.getDescription());
        }

    }
}
