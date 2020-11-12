package com.meow.introductionToJavaOnline.cycles.task8;
//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int firstNumber = in.nextInt();
        int secondNumber = in.nextInt();
        boolean sameNumeralsExist = false;

        while(firstNumber > 0) {
            int firstValue = firstNumber % 10;
            int secondNumberCopy = secondNumber;
            while(secondNumberCopy > 0) {
                if(firstValue == secondNumberCopy%10) {
                    System.out.println(firstValue + " ");
                    sameNumeralsExist = true;
                    break;
                }
                secondNumberCopy /= 10;
            }
            firstNumber /= 10;
        }
        if(!sameNumeralsExist) {
            System.out.println("There are no same numerals");
        }
    }
}
