package com.company;

import java.io.*;
import java.util.*;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        // Write your code here.
        scanner.close();
        if (s.length() == 0) {
            System.out.println(0);
            System.exit(0);
        }

        String[] arrOfString = s.split("['!?,._@ ]+");

        System.out.println(arrOfString.length);
        for (String str: arrOfString) {
            System.out.println(str);
        }
    }
}
