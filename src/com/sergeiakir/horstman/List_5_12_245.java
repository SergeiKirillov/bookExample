package com.sergeiakir.horstman;

import java.util.Locale;
import java.util.Scanner;

public class List_5_12_245 {
    public static void main(String[] args) {

        System.out.println("ToString() "+Size.LARGE.toString()); //Имя Константы
        System.out.println("valueOf() "+Size.valueOf("LARGE"));

        Size[] values = Size.values();
        for (Size i : values) { //Метод выводит массив значений
            System.out.println(i.toString() + " ordinal() -> " + i.ordinal()); //original - позиция константы в перечислении
        }


        var in = new Scanner(System.in);
        System.out.print("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE)");
        String input = in.next().toUpperCase();

        Size size = Enum.valueOf(Size.class,input);
        System.out.println("size="+size);
        System.out.println("abbreviation="+size.getAbbrevation());
        if(size == Size.EXTRA_LARGE)
            System.out.println("Good job -- you paid attention to the_.");
    }



}
enum Size{
    SMALL("S"), MEDIUM("M"), LARGE("L"),EXTRA_LARGE("XL");

    private String abbrevation;

    Size(String abbreviation){
        this.abbrevation = abbreviation;
    }
    public String getAbbrevation(){
        return abbrevation;
    }

}