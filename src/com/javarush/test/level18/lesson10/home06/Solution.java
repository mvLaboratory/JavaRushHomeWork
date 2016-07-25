package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки. Не использовать try-with-resources

Пример вывода:
, 19
- 7
f 361
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public static HashMap<Integer, Integer> counter = new HashMap<Integer, Integer>();
    public static ArrayList<Integer>  keyList = new ArrayList<Integer>();

    public static void main(String[] args) throws IOException {
        if (args.length == 0)
            return;

        String fileName = args[0];
        FileInputStream file = new FileInputStream(fileName);


        while (file.available() > 0) {
            int fileInfo = file.read();

            put(fileInfo);
        }

        print();

        file.close();
    }

    public static void put(Integer key) {
        if (counter.isEmpty()) {
            addToKeyList(key);
            counter.put(key, 1);
        }
        else
        {
            if (counter.containsKey(key))
            {
                int presentValue = counter.get(key);
                counter.put(key, ++presentValue);
            }
            else {
                addToKeyList(key);
                counter.put(key, 1);
            }
        }
    }

    private static void addToKeyList(int key) {
        int i = 0;
        for (i = 0; i < keyList.size(); i++) {
            if (key < keyList.get(i)) break;
        }
        keyList.add(i, key);
    }

    public static void print() {
        for (int key : keyList) {
            System.out.println(Character.toString((char) key) + " " + counter.get(key));
        }
    }
}
