package com.sergeiakir.horstman;

/**
 * В этой программе демонстрируется применение метода equals()
 * @version  1.12
 * @author  Cay Horstmann
 * @see "Java. Библиотека профессионала, том 1. Основы. стр 228"
 */

public class List_5_8 {
    public static void main(String[] args) {
        Employee alice1 = new Employee("Alice Adams",75000,1987,12,15);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("Alice Adams",75000,1987,12,15);

        Employee bob = new Employee("Bob Brandson",50000,1989,10,1);

        System.out.println("alice1==alice2:"+(alice1==alice2));
        System.out.println("alice1==alice3:"+(alice1==alice3));
        System.out.println("alice1.equals(alice3):"+alice1.equals(alice3));
        System.out.println("alice1.equals(bob):"+alice1.equals(bob));

        System.out.println("bob.toString():"+bob);
        Manager carl = new Manager("Carl Cracker", 80000,1987,12,15);
        Manager boss = new Manager("Carl Cracker", 80000,1987,12,15);
        boss.SetBonus(5000);

        System.out.println("Boss.toString():"+ boss);
        System.out.println("carl.equals(boss):"+carl.equals(boss));

        System.out.println("alice1.hashCode():"+alice1.hashCode());
        System.out.println("alice3.hashCode():"+alice3.hashCode());
        System.out.println("boss.hashCode():"+boss.hashCode());
        System.out.println("carl.hashCode():"+carl.hashCode());

    }
}
