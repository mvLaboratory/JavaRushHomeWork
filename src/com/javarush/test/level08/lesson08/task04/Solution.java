package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
//    public static HashMap<String, Date> createMap()
//    {
//        HashMap<String, Date> map = new HashMap<String, Date>();
//        map.put("Сталлоне", new Date("June 1 1980"));
//        map.put("vasa", new Date("MAY 1 1981"));
//        map.put("kolia", new Date("Aug 1 1982"));
//        map.put("petia", new Date("July 1 1983"));
//        map.put("roma", new Date("Sep 1 1981"));
//        map.put("viki", new Date("June 1 1981"));
//        map.put("kaka", new Date("OCT 1 1987"));
//        map.put("fedia", new Date("Nov 15 2014"));
//        return map;
//    }
//
//    public static void removeAllSummerPeople(HashMap<String, Date> map)
//    {
//        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<String, Date> pair = iterator.next();
//            Date birthDay = pair.getValue();
//            int mounth = birthDay.getMonth();
//            if (mounth >= 5 && mounth <= 7) iterator.remove();
//
//        }
//    }
//
//    public static void main(String[] args)
//    {
//        HashMap<String, Date> birthDateMap = createMap();
//        removeAllSummerPeople(birthDateMap);
//
//        for (Map.Entry<String, Date> pair : birthDateMap.entrySet()) System.out.println(pair.getKey() + " - " + pair.getValue());
//    }

    public static void main(String[] args)
    {
        HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);

        for(Map.Entry<String, Date> pair : map.entrySet())
        {
            System.out.println(pair.getValue());
        }
    }

    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));

        //Напишите тут ваш код
        map.put("Дима", new Date("JUNE 28 1984"));
        map.put("Вадим", new Date("APR 29 1992"));
        map.put("Мама", new Date("DEC 11 1959"));
        map.put("Сталлоне1", new Date("Jan 9 1980"));
        map.put("Сталлоне2", new Date("Sep 5 1980"));
        map.put("Сталлоне3", new Date("Aug 28 1980"));
        map.put("Сталлоне4", new Date("JUNE 2 1980"));
        map.put("Сталлоне5", new Date("JUNE 4 1980"));
        map.put("Сталлоне6", new Date("JUNE 6 1980"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //Напишите тут ваш код
        Iterator<Map.Entry<String,Date>> iterator = map.entrySet().iterator();

        while(iterator.hasNext())
        {
            Map.Entry<String,Date> pair = iterator.next();
            Date value = pair.getValue();
            int rad = value.getMonth();
            if(rad == 5 || rad == 6 || rad == 7)
                iterator.remove();
        }


    }
}
