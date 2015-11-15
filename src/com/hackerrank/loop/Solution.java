package com.hackerrank.loop;

import java.util.Scanner;

/**
 * Created by admin on 30.10.2015.
 */
public class Solution
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            long temp = 0;

            for (int j = 0; j < n; j++) {
                temp += (long)Math.pow(2, j) * b;
                System.out.print(a + temp + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
