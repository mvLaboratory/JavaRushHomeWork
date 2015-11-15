package com.javarush.test.level04.lesson16.home03;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    static int exitCode = -1;
    public static void main(String[] args)   throws Exception
    {
        int summ=0, count = 0;
        String sNumber;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (count!=-1) {
            sNumber = reader.readLine();
            count = Integer.parseInt(sNumber);
            summ += count;
        }
        System.out.println(summ);
    }
}
