package com.javarush.test.level15.lesson12.home07;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Файл в статическом блоке
1. Инициализируй константу Constants.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
2. В статическом блоке считай из файла с именем Constants.FILE_NAME все строки и добавь их по-отдельности в List lines.
3. Закрой поток ввода методом close().
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();
    static {
        try
        {
            Scanner fileScaner = new Scanner(new File(Constants.FILE_NAME));
            while (fileScaner.hasNext()) {
                lines.add(fileScaner.nextLine());
            }
            fileScaner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, no such file!");
        }
        finally
        {

        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
