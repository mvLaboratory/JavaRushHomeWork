package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        if (args.length < 3)
        {
            return;
        }

        String cryption = args[0];
        String fileName = args[1];
        String fileOutputName = args[2];

        int direction = 0;
        if (cryption.equals("-e")) {
            direction = 1;
        }
        else if (cryption.equals("-d")) {
            direction = -1;
        }
        else {
            return;
        }

        FileInputStream in = new FileInputStream(new File(fileName));
        byte[] buffer = new byte[in.available()];
        while (in.available() > 0)
        {
            in.read(buffer);
        }
        in.close();

        FileOutputStream resultFile = new FileOutputStream(fileOutputName);
        for (int i = 0; i < buffer.length; i++)
        {
            buffer[i] = (byte) (buffer[i] + (10 * direction));
        }
        resultFile.write(buffer);
        resultFile.close();
    }
}
