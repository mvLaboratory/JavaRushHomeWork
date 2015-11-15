package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandPa1 = new Human("Pavlo", true, 60);
        Human grandMa1 = new Human("Kate", false, 55);
        Human grandPa2 = new Human("Vasa", true, 70);
        Human grandMa2 = new Human("Yla", false, 65);
        Human father = new Human("Misha", true, 25, grandPa2, grandMa2);
        Human mather = new Human("Anna", false, 21, grandPa1, grandMa1);
        Human child1 = new Human("lika", false, 4, father, mather);
        Human child2 = new Human("luka", true, 5, father, mather);
        Human child3 = new Human("leka", false, 3, father, mather);

        System.out.println(grandPa1);
        System.out.println(grandMa1);
        System.out.println(grandPa2);
        System.out.println(grandMa2);
        System.out.println(father);
        System.out.println(mather);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human
    {
        String name;
        Boolean sex;
        int age;
        Human father, mother;

        public Human(String name, Boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, Boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
