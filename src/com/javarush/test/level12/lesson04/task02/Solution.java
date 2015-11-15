package com.javarush.test.level12.lesson04.task02;

/* print(int) и print(Integer)
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.
*/

public class Solution
{
    public static void main(String[] args)
    {
        print(new Integer(10));
        print(15);

    }

    public static void print(int value) {
        System.out.println("int");
    }

    public static void print(Integer value) {
        System.out.println("Integer");
    }
}
