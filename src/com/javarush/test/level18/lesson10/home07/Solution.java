package com.javarush.test.level18.lesson10.home07;

/* Поиск данных внутри файла
Считать с консоли имя файла
Найти в файле информацию, которая относится к заданному id, и вывести ее на экран в виде, в котором она записана в файле.
Программа запускается с одним параметром: id (int)
Закрыть потоки. Не использовать try-with-resources

В файле данные разделены пробелом и хранятся в следующей последовательности:
id productName price quantity

где id - int
productName - название товара, может содержать пробелы, String
price - цена, double
quantity - количество, int

Информация по каждому товару хранится в отдельной строке
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        if  (args.length == 0)
            throw new IllegalArgumentException();;

        int ID = Integer.parseInt(args[0]);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileReader file = new FileReader(fileName);
        BufferedReader  fileReader = new BufferedReader(file);

        String dataID;
        while ((dataID = fileReader.readLine()) != null) {
            if (dataID.startsWith(ID + " ")) {
                System.out.println(dataID);
                break;
            }
        }

        file.close();
        fileReader.close();
        reader.close();
    }
}
