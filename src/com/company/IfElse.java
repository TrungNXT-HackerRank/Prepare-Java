package com.company;
import java.io.*;
import java.util.*;

public class IfElse {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 1)
            System.out.println("Weird");
        else {
            if ((2 <= n) && (n <= 5))
                System.out.println("Not Weird");
            else if ((6 <= n) && (n <= 20))
                System.out.println("Weird");
            else if (n > 20)
                System.out.println("Not Weird");
        }
    }
}
