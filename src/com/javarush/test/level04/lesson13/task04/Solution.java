package com.javarush.test.level04.lesson13.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    static int side = 10;
    public static void main(String[] args) throws Exception
    {
        for (int i = 0; i <side-1; i++) {
            System.out.print("8");
        }

        for (int i = 0; i <=side ; i++)
        {
            System.out.println("8");
        }
    }
}
