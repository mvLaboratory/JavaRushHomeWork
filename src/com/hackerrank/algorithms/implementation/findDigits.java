package com.hackerrank.algorithms.implementation;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by admin on 02.11.2015.
 */
public class findDigits {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++)
            fndDigits(in.nextInt());
    }

    public static void fndDigits(int number) {
        int counter = 0;
        for (int num : getDigits(number)) {
            if (num == 0) continue;
            if (number % num == 0) counter++;
        }
        System.out.println(counter);
    }

    public static ArrayList<Integer> getDigits(int number) {
        ArrayList<Integer> digits = new ArrayList<Integer>();
        while(number != 0) {
            digits.add(number % 10);
            number /= 10;
        }
        return digits;
    }
}
