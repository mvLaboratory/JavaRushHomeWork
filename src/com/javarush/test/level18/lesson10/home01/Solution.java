package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        int letterCounter = 0;
        if  (args.length == 0)
            return;

        String fileName = args[0];
        FileInputStream fileReader = new FileInputStream(fileName);

        while (fileReader.available() > 0) {
            int fileByte = fileReader.read();
            if ((fileByte >= 65 && fileByte <= 90) || (fileByte >= 96 && fileByte <= 122)) letterCounter++;
        }

        System.out.println(letterCounter);

        fileReader.close();
    }
}
