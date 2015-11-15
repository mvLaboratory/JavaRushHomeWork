package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scannerfile = new Scanner(new File(reader.readLine()));

        ArrayList<Integer> fileData = new ArrayList<Integer>();
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

        while (scannerfile.hasNextInt()) {
            fileData.add(scannerfile.nextInt());
        }

        for (int number : fileData) {
            if (isEven(number)) {
              evenNumbers.add(number);
            }
        }

        int[] array = sort(evenNumbers);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static boolean isEven(int number) {
        return (number % 2 == 0) ? true : false;
    }

    public static int[] sort(ArrayList<Integer> list) {
        int[] array = listToArray(list);
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length - 1; j++)
            {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        return array;
    }

    public static int[] listToArray(ArrayList<Integer> list) {
        int[] result = new int[list.size()];
        int index = 0;
        for (int element : list) {
            result[index] = element;
            index++;
        }

        return result;
    }
}
