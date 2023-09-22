package com.startjava.lesson_2;

public class WolfTest_2 {

    public static void main(String[] args) {
        Wolf_2 wolf = new Wolf_2();
        wolf.setGender("Male");
        wolf.setMoniker("Razor");
        wolf.setWeight(100);
        wolf.setAge(10);
        wolf.setColour("Gray");

        System.out.println("Пол волка: " + wolf.getGender() + "\n" +
                "Кличка волка: " + wolf.getMoniker() + "\n" +
                "Вес волка: " + wolf.getWeight() + "\n" +
                "Возраст волка: " + wolf.getAge() + "\n" +
                "Цвет волка: " + wolf.getColour());

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}