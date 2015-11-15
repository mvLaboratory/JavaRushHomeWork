package com.javarush.test.level15.lesson12.home04;

/**
 * Created by admin on 06.10.2015.
 */
public class Moon implements Planet
{
    private static Moon instance;

    public static Moon getInstance()
    {
        if (instance == null) instance = new Moon();
        return instance;
    }

    private Moon()
    {
    }
}
