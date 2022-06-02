package com.company;

import java.io.*;
import java.util.*;

public class StringsIntroduction {
    public static void main(String[] args) {
        /* Enter your code here. Print output to STDOUT. */
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();

        //sum the lengths of A and B
        System.out.println(A.length() + B.length());

        // write Yes if  is lexicographically greater than  otherwise print No instead.
        int A0 = (int) A.charAt(0);
        int B0 = (int) B.charAt(0);
        if (A0 > B0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // capitalize the first letter of both
        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        B = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(A + " " + B);
    }
}
