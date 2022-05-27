package com.company;

import com.sun.source.tree.WhileLoopTree;

import java.io.*;
import java.util.*;


public class EndOfFile {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
           Your class should be named Solution. */

        try (Scanner scanner = new Scanner(System.in)) {
            int count = 1;
            while (scanner.hasNext()) {
                System.out.format("%d %s \n", count++, scanner.nextLine());
            }
        }

    }
}
