package com.javarush.test.level15.lesson12.home04;

/**
 * Created by admin on 06.10.2015.
 */
public class Earth implements Planet
{
    private static Earth instance;

    public static Earth getInstance()
    {
        if (instance == null) instance = new Earth();
        return instance;
    }

    private Earth()
    {
    }
}
