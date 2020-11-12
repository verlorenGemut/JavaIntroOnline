package com.meow.introductionToJavaOnline.cycles.task7;
//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//m и n вводятся с клавиатуры.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter interval boundaries");
        int m = in.nextInt();
        int n = in.nextInt();

        for(int i = m; i < n; i++) {
            boolean ifNumberEasy = true;
            System.out.println("For value " + i + " dividers are: ");
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    System.out.print(j + " ");
                    ifNumberEasy = false;
                }
            }
            if(ifNumberEasy) {
                System.out.println("No dividers");
            }
            else {
                System.out.println();
            }
        }
    }
}
