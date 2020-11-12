package com.meow.introductionToJavaOnline.linear.task1;
//z = ( (a – 3 ) * b / 2) + c

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c, z;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 values");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        if(b == 0) {
            System.out.println("Wrong data!!");
        }
        else {
            z = ((a - 3) * b / 2) + c;
            System.out.println("Result of function is " + z);
        }
    }
}