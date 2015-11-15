package test.numbers;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by admin on 20.10.2015.
 */
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int counter = 0;

        long[] numbers = new long[n]; //cause of 4280447635 input
        for (int i =0; i < n; i++) {
            numbers[i] = sc.nextLong();
        }

        for (int i = 0; i < numbers.length; i++)  {
            for (int j = i+1; j < numbers.length; j++)
            {
                if (Math.abs(numbers[i] - numbers[j]) == k) counter++;
            }
        }


        System.out.println(counter);
    }
}
