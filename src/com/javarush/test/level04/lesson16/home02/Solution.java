package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[3];
        int max, min;
        for (int i = 0; i <3; i++) {
            String sNumber = reader.readLine();
            numbers[i] = Integer.parseInt(sNumber);
        }
        max = numbers[0];
        min = numbers[0];
        for (int i = 0; i <3; i++) {
            if (numbers[i]>max) max=numbers[i];
            else if(numbers[i]<min) min=numbers[i];
        }

        for (int i = 0; i <3; i++) {
            if (!(numbers[i]==max || numbers[i]==min)) System.out.println(numbers[i]);
        }
    }
}
