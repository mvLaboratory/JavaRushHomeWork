package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Sur1", "name1");
        map.put("Sur2", "name2");
        map.put("Sur3", "name3");
        map.put("Sur4", "name1");
        map.put("Sur5", "name15");
        map.put("Sur6", "name14");
        map.put("Sur7", "name13");
        map.put("Sur8", "name1");
        map.put("Sur9", "name12");
        map.put("Sur10", "name1");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
//       HashMap<String, String> copy = new HashMap<String, String>(map);
//       Iterator<Map.Entry<String,String>> iterator = copy.entrySet().iterator();
//       while (iterator.hasNext()) {
//            Map.Entry<String, String> pair = iterator.next();
//            removeItemFromMapByValue(map, pair.getValue());
//       }
        ArrayList<String> doubleNames= new ArrayList<String>();
        int namesCount;

        for (Map.Entry<String, String> pair : map.entrySet()) {
            namesCount = 0;
            for (Map.Entry<String, String> pair2 : map.entrySet()) {
                if (pair.getValue().equals(pair2.getValue())) namesCount++;
            }

            if (namesCount > 1) doubleNames.add(pair.getValue());
        }

        for (String name : doubleNames) removeItemFromMapByValue(map, name);
        int a = 0;
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);

        for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}
