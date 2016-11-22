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

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
        String filename = "";

        try {
            while(true) {
                filename = fileNameReader.readLine();

                if (filename.equals("end"))
                    break;

                nameList.add(filename);
            }
        }
        catch (IOException e) {

        }

        Collections.sort(nameList, new filePartComparator());
        nameList.forEach(System.out::println);

        //BufferedWriter writer = new BufferedWriter(new FileWriter("Lion.avi"))

        for (String fileName : nameList) {

        }

        try
        {
            fileNameReader.close();
        }
        catch (IOException e) {

        }
    }
}
