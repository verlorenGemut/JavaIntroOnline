package com.meow.introductionToJavaOnline.branching.task1;
/*Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
он прямоугольным.*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 angles of triangle");
        double a = in.nextDouble();
        double b = in.nextDouble();

        if (a+b >= 180) {
            System.out.println("Triangle do not exist");
        }
        else {
            if(a+b == 90) {
                System.out.println("Triangle exist and is right");
            }
            else {
                System.out.println("Triangle exist but is not right");
            }
        }
    }
}
