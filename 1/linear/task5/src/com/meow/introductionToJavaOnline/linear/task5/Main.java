package com.meow.introductionToJavaOnline.linear.task5;
/*Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter time in seconds");
        int t, h, m, s;
        t = in.nextInt();

        h = t / 3600;
        t -= h * 3600;

        m = t / 60;
        t -= m * 60;

        s = t;

        System.out.print("Time in normal format is");
        System.out.println(h + "ч " + m + "мин " + s + "с");
    }
}
