package com.meow.introductionToJavaOnline.branching.task5;
//Вычислить значение функции:
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x = ");
        double x = in.nextDouble();
        double f;

        if(x <= 3) {
            f = x*x-3*x+9;
        }
        else {
            f = 1 / (x*x*x+6);
        }
        System.out.println("f(x) = " + f);
    }
}
