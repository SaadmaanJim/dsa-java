package com.assignmnet2;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Principal: ");
        double NumP = scanner.nextDouble();

        System.out.println("Enter The Time: ");
        double NumT = scanner.nextDouble();

        System.out.println("Enter The Rate: ");
        double NumR = scanner.nextDouble();

        double PrincipalInterest = ((NumP * NumR * NumT) / 100);
        System.out.println("The Simple Interest Is: " + PrincipalInterest);


    scanner.close();
    }
}
