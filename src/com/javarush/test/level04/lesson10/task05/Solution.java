package com.javarush.test.level04.lesson10.task05;

/* Таблица умножения
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
...
*/

public class Solution
{
    static int size = 10;
    public static void main(String[] args) throws Exception
    {
        int i = 1, j = 1;
        while (i<=size) {
            while (j<=size) {
                System.out.print(i * j);
                if (j!=10) System.out.print(" ");
                j++;
            }
            j=1;
            i++;
            System.out.println();
        }

    }
}
