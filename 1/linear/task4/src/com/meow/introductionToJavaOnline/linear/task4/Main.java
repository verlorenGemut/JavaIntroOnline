package com.meow.introductionToJavaOnline.linear.task4;
/// r = nnn.ddd; result = ddd.nnn

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner((System.in));
        System.out.println("Enter values");
        double R = in.nextDouble();

        int intPart = (int) R;
        double fractionalPart = R - intPart;

        double result = fractionalPart*1000 + (double)intPart/1000;

        System.out.print("Result is ");
        System.out.printf("%.3f", result);
    }
}
