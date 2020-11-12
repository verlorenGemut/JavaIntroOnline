package com.meow.introductionToJavaOnline.cycles.task2;
//Вычислить значения функции на отрезке [а,b] c шагом h:
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter interval boundaries");
        double a = in.nextDouble();
        double b = in.nextDouble();
        System.out.println("Enter function step");
        double h = in.nextDouble();

        for(double x = a; x <= b; x += h) {
            if(x <= 2) {
                System.out.println("With x = " + x + " f(x) = " + -x);
            }
            else {
                System.out.println("With x = " + x + " f(x) = " + x);
            }
        }
    }
}

