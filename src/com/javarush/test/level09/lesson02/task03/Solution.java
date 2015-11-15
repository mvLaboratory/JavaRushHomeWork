package com.javarush.test.level09.lesson02.task03;

/* Метод должен вернуть номер строки кода, из которого вызвали этот метод
Написать пять методов, которые вызывают друг друга. Метод должен вернуть номер строки кода, из которого вызвали этот метод. Воспользуйся функцией: element.getLineNumber().
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static int method1()
    {
        System.out.println(method2());
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  stackTraceElements[2].getLineNumber();
    }

    public static int method2()
    {
        System.out.println(method3());
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  stackTraceElements[2].getLineNumber();
    }

    public static int method3()
    {
        System.out.println(method4());
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  stackTraceElements[2].getLineNumber();
    }

    public static int method4()
    {
        System.out.println(method5());
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  stackTraceElements[2].getLineNumber();
    }

    public static int method5()
    {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  stackTraceElements[2].getLineNumber();
    }
}
