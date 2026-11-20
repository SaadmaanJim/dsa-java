package com.assignmnet2;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The First Number: ");
        double Num1 = scanner.nextDouble();

        System.out.println("Enter The Second Number: ");
        double Num2 = scanner.nextDouble();

        if(Num1<Num2){
            System.out.println("Number 2 is The Largest.");
        } else if (Num1==Num2) {
            System.out.println("Same Number");
        } else if (Num1>Num2) {
            System.out.println("Number 1 is The Largest");
        }else{
            System.out.println("Invalid. Try Again.");
        }
     scanner.close();
    }
}
