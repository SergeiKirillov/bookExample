package com.sergeiakir.horstman;

import java.lang.reflect.Array;
import java.util.Arrays;

public class List_6_1_278 {
    /**
     * В этой программе демонтстрируется применение интерфейса Comparable
     * @version 27.12.2020
     * @auhtor CayHorstman
     * @see "Java. Библиотека профессионала, том 1. Основы. стр 278"
     *
     */

    public static void main(String[] args) {
        var staff = new Employee[3];

        staff[0]= new Employee("Harry Hacker",35000);
        staff[1]= new Employee("Carl Cracker",75000);
        staff[2]= new Employee("Tony Tester",38000);

        Arrays.sort(staff);

        //Вывести данные обо всех объектах типа Employee
        for (Employee e: staff) {
            System.out.println("name = " + e.getName()+ ", salary = " + e.getSalary());
        }

    }



}
