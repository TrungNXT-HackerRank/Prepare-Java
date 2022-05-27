package com.company;

import java.io.*;
import java.util.*;

public class LoopII {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
           Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int[][] arr = new int[q][15];

        for (int i = 0; i < q; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
            arr[i][2] = scanner.nextInt();
        }

        for (int j = 0; j < q; j++) {
            int sum = arr[j][0];
            for (int t = 0; t < arr[j][2]; t++) {
                sum += (Math.pow(2, t)) * arr[j][1];
                System.out.format("%d ", sum);
            }
            System.out.println();
        }
    }
}
