package com.sergeiakir.LessonJava;

import java.io.*;
import java.util.Arrays;

/**
 *
 */

public class GameUser {
    public static void main(String[] args) throws Exception{
        Short userWar = new Short();
        userWar.shield=10;
        userWar.maxSpeed = 100; //Создание статичного поля
        System.out.println("переменная -> userWar.shield="+userWar.shield);
        WaikPoint wk = new WaikPoint();
        wk.pointWaik=250;
        userWar.waikPoint=wk;
        System.out.println("объект -> userWar.waikPoint.pointWaik="+userWar.waikPoint.pointWaik);
        //Передача для сериализации обекта который не поддерживает сериализацию
        WaikStat ws = new WaikStat();
        ws.StatWaik = 25;
        userWar.waikStat = ws;
        System.out.println("обект без сериализации -> userWar.waikStat.StatWaik="+userWar.waikStat.StatWaik);


        //Сериализация обьекта
        FileOutputStream fosTemp = new FileOutputStream("fileTemp");
        ObjectOutputStream oosTemp = new ObjectOutputStream(fosTemp);
        oosTemp.writeObject(userWar);

        userWar.maxSpeed=50; //Изменение статичного поля


        //Десиализация объекта
        FileInputStream fisTemp = new FileInputStream("fileTemp");
        ObjectInputStream oisTemp = new ObjectInputStream(fisTemp);
        Short newUserWar = (Short) oisTemp.readObject();
        System.out.println("Static переменная ->newUserWar.shield="+newUserWar.shield);
        System.out.println("переменная -> newUserWar.maxSpeed="+newUserWar.maxSpeed); //Итого: Статичные объекты не сериализуются
        System.out.println("объект -> newUserWar.waikPoint.pointWaik="+newUserWar.waikPoint.pointWaik);
        System.out.println("обект без сериализации (null, но не выскакивает ошибка) -> newUserWar.waikStat.StatWaik="+newUserWar.waikStat);

    }

}

class Short implements Serializable{
    int shield;
    static int maxSpeed;
    WaikPoint waikPoint;
    transient WaikStat waikStat;
}

class WaikPoint implements Serializable{
    int pointWaik;
}

class WaikStat {
    int StatWaik;
}