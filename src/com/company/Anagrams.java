package com.company;

import java.util.*;

public class Anagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] arrA = a.toUpperCase().toCharArray();
        char[] arrB = b.toUpperCase().toCharArray();
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        return Arrays.equals(arrA, arrB);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
