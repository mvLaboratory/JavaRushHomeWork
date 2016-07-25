package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception
    {
        StatisticMap byteUsage = new StatisticMap();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
//        //        D:\MV-lab\numbers.txt
        FileInputStream fileReader = new FileInputStream(fileName);
        while (fileReader.available() > 0)
        {
            int fileByte = fileReader.read();
            if (byteUsage.containsKey(fileByte))
            {
                int curByteUsage = byteUsage.get(fileByte);
                byteUsage.put(fileByte, ++curByteUsage);
            } else
            {
                byteUsage.put(fileByte, 1);
            }
        }

        if (byteUsage.isEmpty())
            return;

        System.out.println(byteUsage);
        for (Integer minByte : byteUsage.getMinValueKeys())
        {
            System.out.print(minByte + " ");
        }

        fileReader.close();
    }
}
