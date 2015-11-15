package com.javarush.test.level08.lesson08.task02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(1);  //1
        set.add(2);//2
        set.add(3);//3
        set.add(4);
        set.add(5);
        set.add(6); //6
        set.add(7);
        set.add(8);
        set.add(9);   //9
        set.add(10);
        set.add(11);
        set.add(12);       //12
        set.add(13);      //13
        set.add(14);      //14
        set.add(15);       //15
        set.add(16);       //16
        set.add(17);       //17
        set.add(18);     //18
        set.add(19);      //19
        set.add(20);       //20

        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        HashSet<Integer> removSet = new HashSet<Integer>();

        for (Integer tenInt : set) if (tenInt > 10) removSet.add(tenInt);
        set.removeAll(removSet);

        return set;
    }

    public static void main(String[] args)
    {
        HashSet<Integer> set = createSet();
        HashSet<Integer> mSet = removeAllNumbersMoreThan10(set);

        for (Integer newNumber : mSet) System.out.println(newNumber);
    }
}
