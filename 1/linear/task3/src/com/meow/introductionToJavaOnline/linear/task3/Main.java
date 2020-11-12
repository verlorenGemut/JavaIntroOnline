package com.meow.introductionToJavaOnline.linear.task3;
// (sinx+cosx)/(cosx-sinx) * tgxy
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x, y, result;

        System.out.println("If you want to enter in radians, enter 0");
        System.out.println("otherwise enter anything else");
        int checker = in.nextInt();

        System.out.println("Enter x and y");
        x = in.nextDouble();
        y = in.nextDouble();

        if(checker != 0) {
            x = Math.toRadians(x);
            y = Math.toRadians(y);
        }

        if(Math.cos(x) - Math.sin(x) != 0) {
            result = Math.sin(x) + Math.cos(x);
            result /= Math.cos(x) - Math.sin(x);
            result *= Math.tan(x * y);

            System.out.println("Result of function is " + result);
        }
        else {
            System.out.println("Wrong input data!!");
        }
    }
}
