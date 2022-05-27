package com.company;

import java.util.Scanner;

public class StdinStdoutII {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int firstInt = scanner.nextInt();
        double secondDouble = scanner.nextDouble();
        String newLineCharacter = scanner.nextLine();
        String thirdString = scanner.nextLine();


        System.out.println("String: " + thirdString);
        System.out.println("Double: " + secondDouble);
        System.out.println("Int: " + firstInt);
    }
}
