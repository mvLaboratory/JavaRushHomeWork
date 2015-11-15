package com.hackerrank.stringCompare;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int k = sc.nextInt();
        ArrayList<String> list = new ArrayList<String>();
        String max = line.substring(0, k);
        String min = line.substring(0, k);

        for (int i = 0; i < line.length() - (k - 1); i++) {
            String sub = line.substring(i, i + k);
            if (sub.compareTo(max) > 0) max = sub;
            else if (sub.compareTo(min) < 0) min = sub;
        }

        System.out.println(min);
        System.out.println(max);
    }
}
