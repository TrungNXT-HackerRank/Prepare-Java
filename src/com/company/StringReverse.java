package com.company;

import java.io.*;
import java.util.*;

public class StringReverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        /* Enter your code here. Print output to STDOUT. */
        int count = 0;

        for (int i = 0; i < (A.length()/2); ++i){
            if (A.charAt(i) == A.charAt(A.length() - 1 - i)) {
                count++;
            }
        }
        System.out.println(count == A.length()/2?"Yes":"No");
    }
}
