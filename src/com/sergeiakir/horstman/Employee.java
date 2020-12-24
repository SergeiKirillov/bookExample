package com.sergeiakir.horstman;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;

abstract class Person{
    public abstract String getDescription();
    private String name;

    public Person(String name){
        this.name = name;
    }

    public Person(){
        this.name = "noname";
    }

    public String getName(){
        return name;
    }
}


public class Employee extends Person{
    private static int NextId;
    private int id;

    //private String name = ""; //Инициализация поля Экспереиента

    private LocalDate hireDay;
    private double salary;



    public Employee(String name, double salary, int year, int mount, int day){
        super(name);
        this.salary=salary;
        hireDay = LocalDate.of(year,mount,day);
    }

    //Статичный блок инициализации
    static  {
        var generator = new Random();

        //Задать произвольное число 0-999 в поле nextId
        NextId = generator.nextInt(1000);
    }

    //Блок инициализации объекта
    {
        id = NextId;
        NextId++;
    }




    //Четыре перегруженных конструктора
    public Employee(String n, double s) {
        super(n);
        salary = s;
    }

    public Employee(double s) {
        //Вызвать конструктор Employee(String n, double s)
        this("Employee # " + NextId, s);
    }

    public Employee() {
        //Поля инициализируются пстой строкой  ""
        //поле salary не устанавливается явно, а инициализируется нулем
        //поле id инициализируется в блоке инициализации
    }



    public String getDescription() {
        return String.format("an employee with a salary of $%.2f", salary);
    }


    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay(){return hireDay;}

    public int getId() {
        return id;
    }

    public void raiseSalary(double byPercent){
        double raise = salary*byPercent/100;
        salary += raise;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(employee.salary, salary) == 0 && Objects.equals(hireDay, employee.hireDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hireDay, salary);
    }

    public String toString(){
        return getClass().getName()+"[name="+getName()+",salary="+salary+",hireDay="+hireDay+"]";
    }

}


class Manager extends Employee {
    private double bonus;
    /**
     * @param n Имя работника
     * @param s Зарплата
     * @param year Год приема на работу
     * @param mount Месяц приема на работу
     * @param day День приема на работу
     */

    public Manager(String n, double s, int year, int mount, int day){
        super(n,s,year,mount,day);
        bonus=0;
    }

    public double getSalary(){
        double baseSalary = super.getSalary();
        return  baseSalary+bonus;
    }

    public void SetBonus(double b){
        bonus = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Double.compare(manager.bonus, bonus) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bonus);
    }

    public String toString(){
        return super.toString()+"[bonus="+bonus+"]";
    }

}

class Student extends Person{

    private String major;
    /**
     * @param name Имя студента
     * @param major Специализация студента
     */

    public Student (String name, String major)
    {
        super(name);
        this.major=major;

    }
    @Override
    public String getDescription() {
        return "a student majoring in" +major;
    }
}

