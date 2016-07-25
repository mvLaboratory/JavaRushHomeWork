package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1Name = reader.readLine();
        String file2Name = reader.readLine();

        FileInputStream file1 = new FileInputStream(file1Name);
        FileOutputStream file2 = new FileOutputStream(file2Name);

        int fileSize = file1.available();
        byte[] buffer = new byte[fileSize];
        String resultString = "";
        if (fileSize > 0) {
            file1.read(buffer);
            String file1String = new String(buffer, StandardCharsets.UTF_8);

            String[] numbers = file1String.split(" ");
            for(String number : numbers) {
                double num = Double.parseDouble(number);
                resultString = resultString + Math.round(num) + " ";
            }

            file2.write(resultString.getBytes());
        }

        file1.close();
        file2.close();
        reader.close();
    }
}
