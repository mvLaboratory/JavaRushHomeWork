package com.javarush.test.level04.lesson10.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String something = reader.readLine();
        String sRepeat = reader.readLine();
        int repeat = Integer.parseInt(sRepeat);
        int i=0;
        while (i<repeat) {
            System.out.println(something);
            i++;
        }
    }
}
