package com.sergeiakir.temp;

import java.util.Objects;

public class expEqualsStr extends Object{
    public static void main(String[] args) {
        GroupStudent st1=new GroupStudent("Jim");
        st1.Family="Del";
        GroupStudent st2=new GroupStudent("Jim");
        st2.Family="Del";
        GroupStudent st3=new GroupStudent("Jin");
        st3.Family="Del";

        System.out.println(st2.equals(st1));
        System.out.println(st2.equals(st3));

        GroupStudent st11 = new GroupStudent("Jim");
        st11.Family="Dei";
        GroupStudent st12 = new GroupStudent("Jim");
        st12.Family="Dei";
        GroupStudent st13 = new GroupStudent("Jim");
        st13.Family="Del";
        System.out.println(st12.equals(st11));
        System.out.println(st12.equals(st13));



    }

}

class GroupStudent{
    private String Name;
    public String Family;

    GroupStudent(String name){
        Name=name;
    }

    GroupStudent(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }else{
            if (!(o instanceof GroupStudent)) {
                return false;
            }else{
                GroupStudent that = (GroupStudent) o;
                //return Objects.equals(Name, that.Name) && Objects.equals(Family, that.Family) ;
                if ((this.Name==that.Name)&&(this.Family==that.Family)){
                    return true;
                }
                else
                {
                    return false;
                }
            }


        }


    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Family);
    }

    @Override
    public String toString() {
        return "GroupStudent{" +
                "Name='" + Name + '\'' +
                ", Family='" + Family + '\'' +
                '}';
    }
}