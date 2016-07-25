package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        HashMap<String, String> fileMap = new  HashMap<String, String>();
        ArrayList<String> fileParts = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = "";
        while(!filename.equalsIgnoreCase("end")) {
            try
            {
                filename = reader.readLine();
                if (filename.equalsIgnoreCase("end")) {
                    break;
                }
                int dotIndex = filename.lastIndexOf(".");
                fileParts.add(filename.substring(dotIndex + 1));
                fileMap.put(filename.substring(dotIndex + 1), filename);
            }
            catch (IOException e) {

            }
        }

        try {
            reader.close();
        }
        catch (IOException e) {

        }

        Collections.sort(fileParts);
        if (fileParts.size() == 0 || fileMap.size() == 0) {
            return;
        }
        String outputFileFullName = fileMap.get(fileParts.get(0));
        String outputFileName = outputFileFullName.substring(0, outputFileFullName.lastIndexOf("."));

        try
        {
            FileOutputStream fileOut = new FileOutputStream(outputFileName);

            for (String filePart : fileParts) {
                try {
                    FileInputStream file = new FileInputStream(fileMap.get(filePart));

                    int available = file.available();
                    byte[] buffer = new byte[available];
                    if (available > 0) {
                        file.read(buffer);
                        fileOut.write(buffer);
                    }

                    file.close();
                }
                catch (IOException e)
                {
                }
            }
            fileOut.close();
        }
        catch (IOException e) {

        }
    }
}
