package com.javarush.test.level08.lesson11.bonus03;

import com.javarush.test.level06.lesson08.task05.StringHelper;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length; j++)
            {
                if (isGreaterThen(array[j-1], array[j])) {//       array[j-1] > array[j]) {
                    String temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
       }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThen(String a, String b)
    {
        return a.compareTo(b) > 0;
    }
}
