package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human child1 = new Human("Vasa", true, 20);
        Human child2 = new Human("Kolia", true, 15);
        Human child3 = new Human("Ira", false, 10);

        ArrayList<Human> childList = new ArrayList<Human>();
        childList.add(child1);
        childList.add(child2);
        childList.add(child3);

        Human father = new Human("Vova", true, 30, childList);
        Human mother = new Human("Juli", false, 30, childList);

        ArrayList<Human> childList1 = new ArrayList<Human>();
        ArrayList<Human> childList2 = new ArrayList<Human>();
        childList1.add(father);
        childList2.add(mother);

        Human grandPa1 = new Human("Yura", true, 60, childList1);
        Human grandMa1 = new Human("Myrosia", false, 60, childList1);

        Human grandPa2 = new Human("Ira", true, 45, childList2);
        Human grandMa2 = new Human("Igor", false, 45, childList2);

        System.out.println(child1);
        System.out.println();
        System.out.println(child2);
        System.out.println();
        System.out.println(child3);
        System.out.println();
        System.out.println(father);
        System.out.println();
        System.out.println(mother);
        System.out.println();
        System.out.println(grandPa1);
        System.out.println();
        System.out.println(grandMa1);
        System.out.println();
        System.out.println(grandPa2);
        System.out.println();
        System.out.println(grandMa2);
        System.out.println();
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>();
        }
    }

}
