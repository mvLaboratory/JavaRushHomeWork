package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String[] urlPars = url.split("\\?");
        if (urlPars.length < 2) return;

        String Url_args = urlPars[1];
        String[] argsPars = Url_args.split("&");

        ArrayList<String> arguments = new ArrayList<String>();
        ArrayList<String> objects = new ArrayList<String>();

        for (int i = 0; i < argsPars.length; i++)
        {
            int index = argsPars[i].indexOf("=");
            String newArguent;
            if (index > 0) newArguent = argsPars[i].substring(0, index);
            else newArguent = argsPars[i];

            arguments.add(newArguent);

            if (newArguent.equals("obj")) {
                objects.add(argsPars[i].substring(index + 1));
            }
        }

        for (String arg : arguments) {
            System.out.print(arg + " ");
        }

        System.out.println();

        for (String obj : objects) {
            if (obj.contains(".")) {
                try
                {
                    double doubleTest = Double.parseDouble(obj);
                    alert(Double.valueOf(obj));
                }
                catch (NumberFormatException e)
                {
                    alert(obj);
                }
            }
            else {
                try
                {
                    int intTest = Integer.parseInt(obj);
                    alert(Double.valueOf(obj));
                }
                catch (NumberFormatException e)
                {
                    alert(obj);
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
