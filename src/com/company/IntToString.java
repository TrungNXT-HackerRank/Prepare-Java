package com.company;

import java.io.*;
import java.util.*;

public class IntToString {
    public static void main(String[] args) throws Exception{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
           Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String s = String.format("%d", n);

        System.out.println("Good job");
    }
}
