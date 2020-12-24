package com.sergeiakir.horstman;

/**
 * В этой программе демонстрируется наследование
 * @version  1.21
 * @author  Cay Horstmann
 * @see "Java. Библиотека профессионала, том 1. Основы. стр 202"
 */

public class Lis_5_1 {
    public static void main(String[] args) {
        Manager boss = new Manager("Carl Cracker", 80000, 1987,12,15);
        boss.SetBonus(5000);

        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989,10,1);
        staff[2] = new Employee("Tomy Tester", 40000,1990,3,15);
        for (Employee e: staff) {
            System.out.println("name:" + e.getName()+" Salary: "+ e.getSalary());
        }

    }
}
