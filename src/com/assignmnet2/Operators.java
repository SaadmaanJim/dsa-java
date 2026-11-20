package com.assignmnet2;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The First Number: ");
        double Num1 = scanner.nextDouble();

        System.out.println("Enter The Operator: +, - , * , / ");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter The Second Number: ");
        double Num2 = scanner.nextDouble();
         double result = 0;
        if(operator == '+'){
           result = (Num1+Num2);
        }else if (operator =='-'){
          result = (Num1-Num2);
        }else if(operator == '*'){
           result = (Num1*Num2);
        } else if (operator == '/') {
          result =  (Num1/Num2);
        }else{
            System.out.println("Invalid Input");
        }

        System.out.println("The Operated Result Is: " + result);

        scanner.close();


    }
}
