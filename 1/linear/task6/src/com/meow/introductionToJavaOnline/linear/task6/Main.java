package com.meow.introductionToJavaOnline.linear.task6;
//Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
//принадлежит закрашенной области, и false — в противном случае:
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter coordinates");
        double x = in.nextDouble();
        double y = in.nextDouble();

        System.out.println((x >= -2 && x <= 2 && y <= 4 && y >= -3) || (x >= -4 && x <= -4 && y >= -3 && y <= 0));
    }
}
