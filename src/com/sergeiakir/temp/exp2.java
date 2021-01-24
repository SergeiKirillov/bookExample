package com.sergeiakir.temp;

public class exp2 {
    public static void main(String[] args) {
        Student st1 = new Student(8888,"Jim");
        Student st2 = new Student(8888,"Jim");

        System.out.println(st1.equals(st2));
    }
}

class Student {
    private int student_id;
    private String Name;

    public Student(int student_id, String name) {
        this.student_id = student_id;
        this.Name=name;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        /* obj ссылается на null */

        if (obj == null) {
            return false;
        }

        /* Удостоверимся, что ссылки имеют тот же самый тип */

        if (!(getClass() == obj.getClass())) {
            return false;
        } else {
            Student tmp = (Student) obj;
            if ((tmp.student_id == this.student_id)&&(tmp.Name == this.Name)) {
                return true;
            } else {
                return false;
            }
            //return Integer.compare(tmp.student_id,this.student_id)==0;
        }
    }
}