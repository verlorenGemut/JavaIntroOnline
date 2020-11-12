package com.meow.introductionToJavaOnline.cycles.task6;
//Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
public class Main {

    public static void main(String[] args) {
        System.out.println("There is part of ASCII");
        for (int i = 32; i <= 126; i++) {
            System.out.println(i + " " + (char)i);
        }
    }
}
