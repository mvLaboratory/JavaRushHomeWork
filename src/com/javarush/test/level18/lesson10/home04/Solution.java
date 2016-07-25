package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1Name = reader.readLine();
        String file2Name = reader.readLine();

        FileInputStream file1 = new FileInputStream(file1Name);
        FileInputStream file2 = new FileInputStream(file2Name);

        int file1Count = file1.available();
        byte[] buffer1 = new byte[file1Count];
        if (file1Count > 0) {
            file1.read(buffer1);
        }

        int file2Count = file2.available();
        byte[] buffer = new byte[file2Count];
        if (file2Count > 0) {
            file2.read(buffer);
        }

        file1.close();
        file2.close();

        FileOutputStream fileWriter = new FileOutputStream(file1Name);
        for (int i = 0; i < buffer.length; i++) {
            fileWriter.write(buffer[i]);
        }

        for (int i = 0; i < buffer1.length; i++) {
            fileWriter.write(buffer1[i]);
        }

        fileWriter.close();
        reader.close();
    }
}
