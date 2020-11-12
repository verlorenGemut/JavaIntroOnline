package com.meow.introductionToJavaOnline.branching.task4;
//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
//отверстие.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter hole size");
        double a = in.nextDouble();
        double b = in.nextDouble();
        System.out.println("Enter brick size");
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        boolean result = false;

        if(a >= x) {
            if(b >= y || b >= z) {
                result = true;
            }
        }
        else if (a >= y) {
            if(b >= x || b >= z) {
                result = true;
            }
        }
        else if(a >= z) {
            if(b >= x || b >= y) {
                result = true;
            }
        }

        if(result) {
            System.out.println("brick can go throw the hole");
        }
        else {
            System.out.println("brick cannot go throw the hole");
        }
    }
}
