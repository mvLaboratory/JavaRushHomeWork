package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        int symbolCounter = 0;
        int spaceCounter = 0;

        if (args.length == 0)
            return;

        String fileName = args[0];

        FileInputStream fileReader = new FileInputStream(fileName);

        while (fileReader.available() > 0) {
            int symbolCode = fileReader.read();
            if (symbolCode == 32)
                spaceCounter++;
            symbolCounter++;
        }

        System.out.println((float)Math.round((float)spaceCounter / symbolCounter * 10000) / 100);

        fileReader.close();
    }
}
