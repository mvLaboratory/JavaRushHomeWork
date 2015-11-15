package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Surname1", "vasa");
        map.put("Surname2", "petia");
        map.put("Surname3", "kolia");
        map.put("Surname4", "sasha");
        map.put("Surname5", "vasa");
        map.put("Surname6", "piska");
        map.put("Surname7", "roma");
        map.put("Surname8", "misha");
        map.put("Surname9", "popa");
        map.put("Surname10", "soska");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int sameNameCount = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) if (pair.getValue().equals(name)) sameNameCount++;
        return sameNameCount;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int sameSurnameCount = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) if (pair.getKey().equals(familiya)) sameSurnameCount++;
        return sameSurnameCount;
    }

    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        System.out.println(getCountTheSameFirstName(map, "vasa"));
        System.out.println(getCountTheSameLastName(map, "Surname10"));
    }
}
