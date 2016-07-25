package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        FileInputStream file1 = new FileInputStream(fileName1);
        FileOutputStream file2 = new FileOutputStream(fileName2);
        FileOutputStream file3 = new FileOutputStream(fileName3);

        if (file1.available() > 0) {
            int count = file1.available();
            byte[] buffer = new byte[count];

            file1.read(buffer);
            int halfCount = Math.round((float)count / 2);

            file2.write(buffer, 0, halfCount);
            file3.write(buffer, halfCount, (count - halfCount));
        }

        file1.close();
        file2.close();
        file3.close();
        reader.close();
    }
}
