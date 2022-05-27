package com.company;

import java.util.Scanner;

public class StdinStdoutI {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int firstInt = scanner.nextInt();
        int secondInt = scanner.nextInt();
        int thirdInt = scanner.nextInt();
        scanner.close();

        System.out.println(firstInt);
        System.out.println(secondInt);
        System.out.println(thirdInt);
    }
}
