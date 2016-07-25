package com.javarush.test.level18.lesson03.task03;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
                                    //        D:\MV-lab\numbers.txt
        FileInputStream fileReader = new FileInputStream(fileName);
        HashMap<Integer, Integer> byteUsage = new HashMap<Integer, Integer>();
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

        int maxByteCount = -1;
        ArrayList<Integer> maxByteUsage = new ArrayList<Integer>();

        for (Map.Entry<Integer, Integer> byteCout : byteUsage.entrySet())
        {
            if (byteCout.getValue() > maxByteCount)
            {
                maxByteCount = byteCout.getValue();
            }
        }

        for (Map.Entry<Integer, Integer> byteCout : byteUsage.entrySet())
        {
            if (byteCout.getValue() == maxByteCount)
            {
                maxByteUsage.add(byteCout.getKey());
            }
        }

        for (Integer maxByte : maxByteUsage)
        {
            System.out.print(maxByte + " ");
        }

        fileReader.close();
    }
}
