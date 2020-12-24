package com.sergeiakir.horstman;

public class List_4_5 {
    public static void main(String[] args) {
        //Заполнить массив staff тремя
        //объектами типа Employee

        var staff = new Employee[3];

        staff[0] = new Employee("Harry", 40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();

        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + ",id="
                    + e.getId() + ", salary= " + e.getSalary());

        }

    }
}
