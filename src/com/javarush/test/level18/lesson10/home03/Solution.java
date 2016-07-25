package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1Name = reader.readLine();
        String file2Name = reader.readLine();
        String file3Name = reader.readLine();

        FileOutputStream file1Writer = new FileOutputStream(file1Name);
        FileInputStream file2Reader = new FileInputStream(file2Name);
        FileInputStream file3Reader = new FileInputStream(file3Name);

        int countFile2 = file2Reader.available();
        int countFile3 = file3Reader.available();

        if (countFile2 > 0) {
            byte[] buffer2 = new byte[countFile2];
            file2Reader.read(buffer2);
            file1Writer.write(buffer2);
        }

        if (countFile3 > 0) {
            byte[] buffer3 = new byte[countFile3];
            file3Reader.read(buffer3);
            file1Writer.write(buffer3);
        }

        reader.close();
        file1Writer.close();
        file2Reader.close();
        file3Reader.close();
    }
}
