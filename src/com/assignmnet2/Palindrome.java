package com.assignmnet2;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = scanner.nextLine().toLowerCase();

        int left = 0;
        int right = input.length()-1;
        boolean isPalindrome = true;

        while(left<right){
          if (input.charAt(left) != input.charAt(right)){
              isPalindrome = false;
              break;
          }
          left++;
          right--;
        }
          if(isPalindrome){
              System.out.println("String Is Palindrome");
          }else{
              System.out.println("String Is Not Palindrome");
          }
    }
}
