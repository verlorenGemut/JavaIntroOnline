package com.meow.introductionToJavaOnline.cycles.task1;
//Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
//все числа от 1 до введенного пользователем числа.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number");
	    int x = in.nextInt();
	    int sum = 0;

	    for(int i = 1; i <= x; i++) {
	        sum += i;
        }
        System.out.println("Sum from 1 to " + x + " = " + sum);
    }
}
