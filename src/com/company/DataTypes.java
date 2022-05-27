package com.company;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
           Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++){
            try {
                long tmp = scanner.nextLong();
                System.out.println(tmp + " can be fitted in:");
                if (tmp >= -128 && tmp <= 127) System.out.println("* byte");
                if (tmp >= -Math.pow(2, 15) && tmp <= Math.pow(2, 15) - 1) System.out.println("* short");
                if (tmp >= -Math.pow(2, 31) && tmp <= Math.pow(2, 31) - 1) System.out.println("* int");
                if (tmp >= -Math.pow(2, 63) && tmp <= Math.pow(2, 63) - 1) System.out.println("* long");
            }
            catch (Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
    }
}
