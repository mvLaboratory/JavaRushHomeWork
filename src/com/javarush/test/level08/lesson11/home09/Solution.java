package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date)
    {
        String[] dateArray = date.split(" ");
        Date dDate = new Date(date);
        Date yearStartDate = new Date(Integer.parseInt(dateArray[2]) - 1900, 0, 1);
        long milSecondsCount = dDate.getTime() - yearStartDate.getTime();
        long milSecsPerDay = 24 * 60 *60 *1000;
        int daysCounter = (int)(milSecondsCount / milSecsPerDay);
        daysCounter++;
        return  daysCounter % 2 != 0;
    }
}
