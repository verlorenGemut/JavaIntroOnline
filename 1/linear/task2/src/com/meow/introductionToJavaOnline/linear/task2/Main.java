package com.meow.introductionToJavaOnline.linear.task2;
//(b + sqrt(b^2 + 4*a*c) / 2*a - a^3*c+b^-2
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 values");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        result = b + Math.sqrt(b*b + 4*a*c);
        result /= 2*a;
        result -= Math.pow(a, 3.0) * c;
        result += Math.pow(b, -2.0);

        System.out.println("Result of function is " + result);
    }
}