package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки. Не использовать try-with-resources

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        int counter = 0;
        FileInputStream fileStream = new FileInputStream(filename);
        while (fileStream.available() > 0) {
            int rByte = fileStream.read();
            if (rByte == 44)
                counter++;
        }

        System.out.println(counter);
        reader.close();
        fileStream.close();
    }
}
