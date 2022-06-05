package com.company;

import java.util.*;
import java.util.regex.*;

public class PatternSyntaxChecker {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases > 0){
            String pattern = in.nextLine();
            //Write your code
            try {
                Pattern pattern1 = Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (Exception PatternSyntaxException) {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}
