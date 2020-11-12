package com.meow.introductionToJavaOnline.branching.task3;
//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter coorditanes of 3 dots");
        Scanner in = new Scanner(System.in);
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double x3 = in.nextDouble();
        double y3 = in.nextDouble();
        if(Math.abs(x1-x2) < 0.0001) {
            if(Math.abs(x1-x3) < 0.0001) {
                System.out.println("they are on one line");
            }
            else {
                System.out.println("they are not on one line");
            }
        }
        else {
            double k = (y1 - y2) / (x1 - x2);
            double b = y1 - k * x1;
            if (k * x3 + b == y3) {
                System.out.println("they are on one line");
            }
            else {
                System.out.println("they are not on one line");
            }
        }

    }
}
