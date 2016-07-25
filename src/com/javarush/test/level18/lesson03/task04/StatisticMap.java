package com.javarush.test.level18.lesson03.task04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StatisticMap extends HashMap<Integer, Integer>
{
    int maxValue, minValue;
    boolean statisticInitialized;

    public StatisticMap() {
        statisticInitialized = false;
    }

    public int getMaxValue()
    {
        return maxValue;
    }

    public int getMinValue()
    {
        return minValue;
    }

    public ArrayList<Integer> getMinValueKeys() {
        ArrayList<Integer> minValueKeys = new ArrayList<Integer>();
        for (Map.Entry<Integer, Integer> valueKeys : this.entrySet())
        {
            if (valueKeys.getValue() == minValue)
                minValueKeys.add(valueKeys.getKey());
        }

        return minValueKeys;
    }

    public ArrayList<Integer> getMaxValueKeys() {
        ArrayList<Integer> maxValueKeys = new ArrayList<Integer>();
        for (Map.Entry<Integer, Integer> valueKeys : this.entrySet())
        {
            if (valueKeys.getValue() == maxValue)
                maxValueKeys.add(valueKeys.getKey());
        }

        return maxValueKeys;
    }

    @Override
    public Integer put(Integer key, Integer value)
    {
        if (statisticInitialized) {
            maxValue = value > maxValue ? value : maxValue;
            minValue = value < minValue ? value : minValue;
        }
        else
        {
            maxValue = value;
            minValue = value;
            statisticInitialized = true;
        }
        return super.put(key, value);
    }
}
