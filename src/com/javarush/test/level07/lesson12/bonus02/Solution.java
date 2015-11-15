package com.javarush.test.level07.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter). Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.
Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter). Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное – утраивается.
Пример ввода:
Кот
Коты
Я
Пример вывода:
Кот Кот Кот
Коты Коты
Я Я Я
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> listUpperCase = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++)
        {
            String s = list.get(i);
            listUpperCase.add(s.toUpperCase());
        }

        ArrayList<String> changedList = changeLint(listUpperCase);
        String temp = new String();

        for (String cell : changedList)
        {
            if (temp.isEmpty() || !temp.equals(cell)) {
                temp = cell;
                System.out.println();
            }

            System.out.print(cell + " ");
        }
    }

    public static ArrayList<String> changeLint (ArrayList<String> list) {
        ArrayList<String> returnList = new ArrayList<String>();
        String listString = new String();
        for (int i = 0; i < list.size(); i++)
        {
            listString = list.get(i);
            if (listString.length() % 2 == 0) {
                returnList.add(listString);
                returnList.add(listString);
            }

            if ((listString.length() == 1) || (listString.length() % 3 == 0)) {
                returnList.add(listString);
                returnList.add(listString);
                returnList.add(listString);
            }
        }
        return returnList;
    }
}