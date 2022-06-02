package com.company;

import java.io.*;
import java.util.*;
import java.text.NumberFormat;

public class CurrencyFormatter {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
           Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        printCurrency(payment, "u");
        printCurrency(payment, "i");
        printCurrency(payment, "c");
        printCurrency(payment, "f");
    }

    public static void printCurrency(double currentAmount, String outputCurrency) {
        Locale locale;

        switch (outputCurrency) {
            case "u":
                locale = Locale.US;
                break;
            case "i":
                locale = new Locale("en", "IN");
                break;
            case "c":
                locale = Locale.CHINA;
                break;
            default:
                locale = Locale.FRANCE;
        }

        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);

        if (outputCurrency.equals("u")) {
            System.out.println(locale.getCountry() + ": " + nf.format(currentAmount));
        } else {
        System.out.println(locale.getDisplayCountry() + ": " + nf.format(currentAmount));
        }
    }
}
