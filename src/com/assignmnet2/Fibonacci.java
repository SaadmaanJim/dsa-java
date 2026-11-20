package com.assignmnet2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = scanner.nextInt();

        int firstNumber = 0;
        int secondNumber = 1;

        for(int i = 0; i<num;i++){
            System.out.println(firstNumber + " ");

            int next = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = next;

            scanner.close();
        }


    }
}
