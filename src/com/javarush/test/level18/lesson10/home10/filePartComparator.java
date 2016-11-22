package com.javarush.test.level18.lesson10.home10;

import java.util.Comparator;

public class filePartComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2)
    {
        int name1End = o1.indexOf(".part");
        String number1 = o1.substring(name1End + 5);

        int name2End = o2.indexOf(".part");
        String number2 = o2.substring(name2End + 5);

        int n1 = 0;
        int n2 = 0;

        try
        {
            n1 = Integer.parseInt(number1);
            n2 = Integer.parseInt(number2);
        }
        catch (NumberFormatException e) {
            e.printStackTrace();
        }

        //System.out.println("Compare: " + o1 + " to " + o2 + "; " + n1 + ":" + n2);
        return n1 - n2;
    }
}
