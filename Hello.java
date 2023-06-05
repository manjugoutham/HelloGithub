package com.demojava;

import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {

        System.out.println("Welcome to Java world");
//        int a = 2, b = 3,res;
//        res = a + b;
//        System.out.println("The result is: "+ res);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number :");
        int number2 = scanner.nextInt();

        int res1 = number1 + number2;
        System.out.println("The result is: "+ res1);
    }
}
