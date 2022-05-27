package com.company;

import java.io.*;

public class LoopsI {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for (int i = 1; i < N; i++) {
            System.out.format("%d x %d = %d\n", 2, i, 2 * i);
        }
        bufferedReader.close();
    }
}
