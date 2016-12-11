package com.javarush.test.level18.lesson10.bonus02;

/* Прайсы
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается со следующим набором параметров:
-c productName price quantity
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-c  - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно, инкрементируя максимальный id, найденный в файле

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length < 4) {
            System.out.println("not enough arguments");
            return;
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        if (args[0].equals("-c")) {
            BufferedReader dbReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName),"windows-1251"));
            long maxID = 0;
            String dbLine;
            while ((dbLine = dbReader.readLine()) != null) {
                String strID = dbLine.substring(0, 8).trim();
                long id = Long.parseLong(strID);
                if (id > maxID) maxID = id;
            }
            dbReader.close();

            PrintWriter dbFile = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));

            String newID = ("" + (++maxID) + "        ").substring(0, 8);
            StringBuilder productNameBuilder = new StringBuilder();
            for (int i = 1; i < args.length - 2; i++) {
                if (i > 1) productNameBuilder.append(" ");
                productNameBuilder.append(args[i]);
            }
            productNameBuilder.append("                              ");
            String productName = productNameBuilder.toString().substring(0, 30);
            String price = ("" + args[args.length - 2] + "        ").substring(0, 8);
            String quantity = ("" + args[args.length - 1] + "    ").substring(0, 4);
            dbFile.println("" + newID + productName + price + quantity);
            dbFile.close();
        }
    }
}
