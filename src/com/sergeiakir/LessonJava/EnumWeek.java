package com.sergeiakir.LessonJava;

/**
 *  Перечисление дни недели в зависимости от графика
 *  5 бр
 *  смещенный график 1 бр
 *  смещенный график 2 бр
 *
 */

enum week5br{ Понедельник(1,false),Вторник(2,false),Среда(3,false),Четверг(4,false),Пятница(5,false),
    Суббота(6,true){
        @Override
        String getNameDay() {
            return"Выходной";
            };
        },
    Воскресенье(7,true){
        @Override
        String getNameDay() {
            return "Выходной";
        }
    };

    private int numberDay;
    private boolean holiday;
    String NameDay = "Будни";

    week5br(int dayNumber, boolean holiday)
    {
        numberDay=dayNumber;
        this.holiday = holiday;
    }

    String getHoliday(){
        if (holiday) {
            return "Не пашем";
        }
        else return "Пашем";
    }

    int getNumberDay(){
        return numberDay;
    }

    String getNameDay(){
        return NameDay;
    }
}

enum Grafic07{
    Понедельник(1){
        @Override
        String getHoliDay() {
            return "1 бригада - рабочий, 2 бригада - выходной";
        }
    }, Вторник(2),Среда(3),Четверг(4),
    Пятница(5){
        @Override
        String getHoliDay(){
            return "1 бригада - выходной, 2 бригада - рабочий";
        }
    },
    Суббота(6){
        @Override
        String getHoliDay(){
            return "1 бригада - выходной, 2 бригада - рабочий";
        }
    },Воскресенье(7){
        @Override
        String getHoliDay() {
            return "1 бригада - рабочий, 2 бригада - выходной";
        }
    };

    private int NumberDay;
    private int Brig;

    Grafic07(int numberDay){
        this.NumberDay=numberDay;

    }
    String getHoliDay() {
        return "1 бригада - рабочий, 2 бригада - рабочий";
    }
}




public class EnumWeek {

    public static void main(String[] args) {


        week5br work = week5br.Суббота;
        System.out.println(work.getNumberDay());
        System.out.println(work.toString());
        System.out.println(work.getHoliday());
        System.out.println(work.getNameDay());


        for (Grafic07 E: Grafic07.values()){
            //Grafic07 br1 = Grafic07.;
            System.out.println(E.toString());
            System.out.println(E.getHoliDay());
        }




    }


}
