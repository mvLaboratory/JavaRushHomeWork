package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        HashSet<String> lWordsSet = new HashSet<String>();
        lWordsSet.add("Лlasfdhgf"); //1
        lWordsSet.add("Лlidfhgjgf"); //2
        lWordsSet.add("Лlo"); //3
        lWordsSet.add("Лlpert55"); //4
        lWordsSet.add("Лlmmmmm"); //5
        lWordsSet.add("Лllu");  //6
        lWordsSet.add("Лlyqwe"); //7
        lWordsSet.add("Лlt");  //8
        lWordsSet.add("Лlrdfgdfgh"); //9
        lWordsSet.add("Лledfsg");    //10
        lWordsSet.add("Лlw");   //11
        lWordsSet.add("Лlq");    //12
        lWordsSet.add("Лls");     //13
        lWordsSet.add("Лld");     //14
        lWordsSet.add("Лlsd");     //15
        lWordsSet.add("Лlili");     //16
        lWordsSet.add("Лlala");     //17
        lWordsSet.add("Лlika");    //18
        lWordsSet.add("Лlona");  //19
        lWordsSet.add("Лluba"); //20

        return lWordsSet;
    }

//    public static void main(String[] args)
//    {
//        HashSet<String> set = createSet();
//        for (String lWord : set) System.out.println(lWord);
//    }
}
