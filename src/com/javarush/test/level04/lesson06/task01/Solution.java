package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код

        /* данные для тестирования:
        введите 1 и 2, минимум =  1
        введите 2 и 1, минимум =  1
        введите 1 и 1, минимум =  1
        введите -1 и -2, минимум =  -2
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber1 = reader.readLine();
        String sNumber2 = reader.readLine();

        int number1 = Integer.parseInt(sNumber1);
        int number2 = Integer.parseInt(sNumber2);

        if (number1<number2) System.out.println(number1);
        else System.out.println(number2);
    }
}