package com.javarush.test.level04.lesson10.task04;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в одной строке не разделять.
*/

public class Solution
{
    static int size = 10;
    static String latter = "S";
    public static void main(String[] args) throws Exception
    {
        int i=0, j=0;
        while(i<size) {
            while (j<size) {
                System.out.print(latter);
                j++;
            }
            System.out.println();
            j=0;
            i++;
        }
    }
}
