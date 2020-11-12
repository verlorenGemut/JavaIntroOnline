package com.meow.introductionToJavaOnline.cycles.task3;
//Найти сумму квадратов первых ста чисел.
public class Main {

    public static void main(String[] args) {
	    int sum = 0;
	    for(int i = 1; i <= 100; i++) {
	        sum += i*i;
        }
        System.out.println("Sum of squares of first 200 numbers = " + sum);
    }
}
