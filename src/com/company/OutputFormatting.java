package com.company;

import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
        Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i <3; i++) {
            String str = scanner.next();
            int firstInt = scanner.nextInt();
            System.out.format("%-15s%03d%n", str, firstInt);
        }
        System.out.println("================================");
    }
}
