package com.company;

import java.io.*;
import java.util.*;


public class StaticInitializerBlock {
    static  Scanner scanner = new Scanner(System.in);
    static int breadth = scanner.nextInt();
    static int height = scanner.nextInt();
    static boolean flag = false;
    static {
        try {
            if ((breadth <= 0) || (height <= 0)) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            } else flag = true;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws java.lang.Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
           Your class should be named Solution. */
        if (flag) {
            System.out.println(breadth * height);
        }


    }
}
