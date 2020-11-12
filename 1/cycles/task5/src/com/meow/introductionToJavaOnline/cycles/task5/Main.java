package com.meow.introductionToJavaOnline.cycles.task5;
//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
//заданному е.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount of members");
        int n = in.nextInt();
        System.out.println("Enter e");
        double e = in.nextDouble();
        double a;
        double sum = 0.0;
        for(int i = 1; i <= n; i++) {
            a = 1 / Math.pow(2.0, i) + 1/Math.pow(3.0, i);
            if(Math.abs(a-e)>0.0001) {
                sum += a;
            }
        }
        System.out.println("Sum of choosen members = " + sum);
    }
}
