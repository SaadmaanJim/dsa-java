package com.assignmnet2;

import java.util.Scanner;

public class FindingArmstrong {

  public static boolean isArmstrong(int number){
   if(number<0){
       return false;
   }
     int original = number;
     int digits = String.valueOf(number).length();
     int sum = 0;

     while(number>0){
         int digit = number % 10;
         sum += Math.pow(digit,digits);
         number /= 10;

     }

   return sum==original;
  }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        if(isArmstrong(number)){
            System.out.println( number + " is an Armstrong Number.");
        }else {
            System.out.println(number + " is not an Armstrong Number.");
        }

    }
}
