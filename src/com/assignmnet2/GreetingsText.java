package com.assignmnet2;

import java.util.Scanner;

public class GreetingsText {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter A Name:");
        String name = scanner.nextLine();

        System.out.println("Good Evening " + name );
    }
}
