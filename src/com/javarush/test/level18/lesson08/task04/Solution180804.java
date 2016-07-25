package com.javarush.test.level18.lesson08.task04;

import java.io.IOException;

/**
 * Created by mv on 09.06.2016.
 */
public class Solution180804
{
    public static void main(String[] args) throws IOException, UnsupportedFileNameException
    {
        String fileName = "D:/MV-lab/numbers.tx1t";
        new TxtInputStream(fileName);
    }
}
