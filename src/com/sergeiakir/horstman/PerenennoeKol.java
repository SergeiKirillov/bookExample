package com.sergeiakir.horstman;

/**
 * @see "Java.Библиотека профессионала. Том 1.Основы. 11 издание — 5.5 - стр 243 "
 */

public class PerenennoeKol {
    public static void main(String[] args) {
        System.out.println("c 1 параметром");
        perem(1);
        System.out.println("c 5 параметрами");
        perem(1,2,3,4,5);
    }
    public static void perem (int... arg){
        for (int n: arg) {
            System.out.println(n);
        }
    }
}
