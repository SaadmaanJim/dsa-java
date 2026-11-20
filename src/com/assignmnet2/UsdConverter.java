package com.assignmnet2;

import java.util.Scanner;

public class UsdConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Rupee Amount To Convert: ");
        double cash = scanner.nextDouble();

        double convert = 0;

        convert = cash / 92.57;

        System.out.println("Rupee To USD Conversion: "+ convert);

    scanner.close();
    }
}
