package com.meow.introductionToJavaOnline.cycles.task4;
//Составить программу нахождения произведения квадратов первых двухсот чисел
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        BigInteger x = BigInteger.valueOf(1);
        for(int i = 2; i <= 200; i++) {
            x = x.multiply(BigInteger.valueOf((long) i * i));
        }
        System.out.println("200!*200! = " + x);
    }
}
