package com.javarush.test.level08.lesson11.home03;

import java.util.HashMap;
import java.util.Map;

/* Люди с одинаковыми именами и/или фамилиями
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList()
    {
        HashMap<String, String> peaple = new HashMap<String, String>();
        String someSur = "sur1";
        peaple.put(someSur, "Name1");
        peaple.put("Sur1", "Name2");
        peaple.put("Sur3", "Name8");
        peaple.put("Sur4", "Name6");
        peaple.put("Sur5", "Name1");
        peaple.put("Sur6", "Name4");
        peaple.put("Sur7", "Name9");
        peaple.put("Sur8", "Name5");
        peaple.put("Sur9", "Name2");
        peaple.put("Sur10", "Name7");

        return peaple;
    }

    public static void printPeopleList(Map<String, String> map)
    {
        for (Map.Entry<String, String> s : map.entrySet())
        {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

}
