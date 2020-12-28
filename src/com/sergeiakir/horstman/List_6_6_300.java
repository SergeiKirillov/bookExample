package com.sergeiakir.horstman;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;

public class List_6_6_300 {
    public static void main(String[] args) {
        String[] planets = new String[] {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

        System.out.println(Arrays.toString(planets));

        System.out.println("--------------------------------------------------------");


        System.out.println("Sort:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));

        System.out.println("--------------------------------------------------------");

        System.out.println("Sort by lenth:");
        Arrays.sort(planets, (first,second)->first.length()-second.length());
        System.out.println(Arrays.toString(planets));

        System.out.println("--------------------------------------------------------");

        Timer t = new Timer(1000, event -> System.out.println("Время:"+new Date()));
        t.start();

        JOptionPane.showMessageDialog(null, "Выход из программы?");
        System.exit(0);

    }
}
