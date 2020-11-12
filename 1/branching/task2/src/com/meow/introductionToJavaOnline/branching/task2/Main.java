package com.meow.introductionToJavaOnline.branching.task2;
//Найти max{min(a, b), min(c, d)}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter 4 numbers");
        Scanner in = new Scanner(System.in);
	    int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        if(a < b) {
            if(c < d) {
                if(a < c) {
                    System.out.println(c);
                }
                else {
                    System.out.println(a);
                }
            }
            else {
                if(a < d) {
                    System.out.println(d);
                }
                else {
                    System.out.println(a);
                }
            }
        }
        else {
            if(c < d) {
                if(b < c) {
                    System.out.println(c);
                }
                else {
                    System.out.println(b);
                }
            }
            else {
                if(b < d) {
                    System.out.println(d);
                }
                else {
                    System.out.println(b);
                }
            }
        }
    }
}
