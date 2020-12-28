package com.sergeiakir.horstman;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.time.*;
import javax.swing.*;


class TimePrinter implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Сейчас время: " + Instant.ofEpochMilli(e.getWhen()));
        Toolkit.getDefaultToolkit().beep();
    }
}

public class List_6_3_288 {
    public static void main(String[] args) {
        var Listiner = new TimePrinter();

        var timer = new Timer(1000, Listiner);
        timer.start();

        JOptionPane.showMessageDialog(null, "Конец программы");
        System.exit(0);

    }
}
