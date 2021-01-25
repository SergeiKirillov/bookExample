package com.sergeiakir.temp;

import java.util.Objects;

public class exp1 {
    public static void main(String[] args) {
        box fig1 = new box(24,36);
        fig1.S=10;


        box fig2=new box(24,36);
        fig2.S=10;

        System.out.println(fig2.equals(fig1));
        System.out.println("fig2="+fig2.hashCode()+" - fig1="+fig1.hashCode());


        String str1="Hello";
        String str2="HellO";
        System.out.println(str1.equals(str2));
        System.out.println("str1="+str1.hashCode()+" - str2="+str2.hashCode());

    }
}

class box{
    private int Height;
    private int Weight;
    public int S;

    public box(int h, int w){
        Height=h;
        Weight=w;
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
            box tmp = (box) obj;

            if ((tmp.Weight == this.Weight)&&(tmp.Weight==this.Weight)&&(tmp.S==this.S)) {
                 return true;
             } else {
                 return false;
             }


            //return Integer.compare(tmp.Height,this.Height)==0 && Integer.compare(tmp.Weight,this.Weight)==0 && Integer.compare(tmp.S,this.S)==0;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(Height, Weight, S);
    }

    @Override
    public String toString() {
        return "box{" +
                "Height=" + Height +
                ", Weight=" + Weight +
                ", S=" + S +
                '}';
    }
}
