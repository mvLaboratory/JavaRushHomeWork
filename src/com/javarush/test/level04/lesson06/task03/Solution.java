package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[3];
        int tempMax;
        boolean needMore = true;

        for (int i=0; i<3; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        while (needMore) {
            for (int i=1; i<3; i++) {
                if (numbers[i]>numbers[i-1]) {
                    tempMax = numbers[i-1];
                    numbers[i-1] = numbers[i];
                    numbers[i] = tempMax;
                }
                else needMore = false;
            }
        }

        for (int i = 0; i <3; i++) {
            System.out.println(numbers[i]);
        }
    }
}
