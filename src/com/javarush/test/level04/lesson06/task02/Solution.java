package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[4];
        String sNumber;
        int maxNumber;

        for (int i=0; i<4; i++) {
            sNumber = reader.readLine();
            numbers[i] = Integer.parseInt(sNumber);
        }
        maxNumber = numbers[0];
        for (int i=1; i<4; i++) {
            if (numbers[i]>maxNumber) maxNumber = numbers[i];
        }
        System.out.println(maxNumber);
    }
}
